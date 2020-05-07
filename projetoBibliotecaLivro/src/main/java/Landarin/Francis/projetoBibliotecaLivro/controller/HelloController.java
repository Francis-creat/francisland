package Landarin.Francis.projetoBibliotecaLivro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String index(){return "Seja Bem Vindo a Biblioteca Virtual";}

}
