package landarin.francis.projetogradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControle {

    @GetMapping("/")
    public String index(){
        return "Olá, innicando controle";
    }

}
