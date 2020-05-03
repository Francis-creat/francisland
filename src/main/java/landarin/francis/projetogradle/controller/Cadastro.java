package landarin.francis.projetogradle.controller;

import landarin.francis.projetogradle.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;


public class Cadastro {

    private ArrayList<Cliente> objCadastro;

    public Cadastro() {
        objCadastro = new ArrayList<Cliente>();
    }
    @GetMapping("/clientes")
    public ArrayList<Cliente> getObjCadastro() {
        return objCadastro;
    }

    public void setObjCadastro(ArrayList<Cliente> objCadastro) {
        this.objCadastro = objCadastro;
    }
    public void adicionarCliente(Cliente c){
        this.objCadastro.add(c);
    }
    public void apagarTudo(){
        this.objCadastro.clear();
    }
}


