package Landarin.Francis.projetoBibliotecaLivro.controller;

import Landarin.Francis.projetoBibliotecaLivro.model.LivroEntity;
import Landarin.Francis.projetoBibliotecaLivro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")

public class LivroController{

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public ResponseEntity<List<LivroEntity>> findAll (){
        return new ResponseEntity<List<LivroEntity>>(
                (List<LivroEntity>) this.livroRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);

    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<LivroEntity> findById (@PathVariable ("id") long id) {
        if (this.livroRepository.findById(id).isPresent()) {
            return new ResponseEntity<LivroEntity>(
                    this.livroRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<LivroEntity>(HttpStatus.NOT_FOUND);

    }
    public ResponseEntity<LivroEntity> cadastrar (@RequestBody LivroEntity livroEntity){
        return  new ResponseEntity<LivroEntity>(
                this.livroRepository.save(livroEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );


    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<LivroEntity> atualizar (@PathVariable ("id") long id,
                                                  @RequestBody LivroEntity livroEntity) throws Exception{
        if (id == 0 || ! this.livroRepository.existsById(id)){
            throw new Exception("cód não encontrado ou inexistente");
        }
        return new ResponseEntity<LivroEntity>(
                this.livroRepository.save(livroEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }
    @DeleteMapping(value = ("/{id}"))
    public ResponseEntity<LivroEntity> deletar (@PathVariable("id") long id){
        this.livroRepository.deleteById(id);
        return new ResponseEntity<LivroEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}