package landarin.francis.projetogradle.controller;


import landarin.francis.projetogradle.model.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController

public class Cinema {

    private ArrayList<Filme> objCinema;

    public Cinema(){
        objCinema= new ArrayList<Filme>();
    }
    @GetMapping("/filmes")
    public ArrayList<Filme> getObjCinema() {
        return objCinema;
    }

    public void setObjCinema(ArrayList<Filme> objCinema) {
        this.objCinema = objCinema;
    }
}
