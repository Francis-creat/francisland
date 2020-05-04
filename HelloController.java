package landarin.francis.projetoEmpresa.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private String Index(){
        return "Iniciar Controle";
    }
}
