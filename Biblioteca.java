package landarin.francis.projetoBiblioteca.Controller;

import landarin.francis.projetoBiblioteca.Model.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private long cnpj;
    private ArrayList<Livro> objBiblioteca;

    public Biblioteca(){
        objBiblioteca=new ArrayList<Livro>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getObjBiblioteca() {
        return this.objBiblioteca;
    }

    public void setObjBiblioteca(ArrayList<Livro> biblioteca) {
        this.objBiblioteca = biblioteca;
    }
    @GetMapping("/Livros")
    public void adicionarLivro(Livro l){
        this.objBiblioteca.add(l);
    }
    public void apagarTudo(){
        this.objBiblioteca.clear();
    }
    public int obterQuantidadedeLivros(){
        return this.objBiblioteca.size();
    }


    @Override
    public String toString() {
        return"\n"
                +"Nome: " + nome +"\n"
                +"CNPJ: " + cnpj +"\n"
                +"Livro "+this.objBiblioteca;

    }


}
