package landarin.francis.projetoEmpresa.controller;

import landarin.francis.projetoEmpresa.model.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private long cnpj;
    private ArrayList<Funcionario> listaDeFuncionarios;

    public Empresa(){
        this.listaDeFuncionarios= new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(ArrayList<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
    @GetMapping("/Folha")
    public double calcularFolhaDePagamento(){
        double folha=0;
        for(int i=0; i< this.listaDeFuncionarios.size();i++){
            folha+= this.listaDeFuncionarios.get(i).getSalario();
        }
        return folha;
    }
    @GetMapping("/Media Salarial")
    public double calcularMediaSalarial(){
        double media=0;
        for(int i=0; i<this.listaDeFuncionarios.size();i++){
            media+= this.listaDeFuncionarios.get(i).getSalario();
        }
        return media/this.listaDeFuncionarios.size();
    }
    @GetMapping("/Maior Salario")
    public double mostrarMaiorSalario(){
        double maiorSalario=0;
        for(int i=0; i<this.listaDeFuncionarios.size();i++){
            if(this.listaDeFuncionarios.get(i).getSalario()> maiorSalario){
                maiorSalario=this.listaDeFuncionarios.get(i).getSalario();
            }

        }
        return maiorSalario;
    }
    @GetMapping("/Funcionario por Cpf")
    public Funcionario PesquisarFuncionarioPorCpf(long cpf){
        for(int i=0; i<this.listaDeFuncionarios.size();i++){
            if(this.listaDeFuncionarios.get(i).getCpf()== cpf){
                return this.listaDeFuncionarios.get(i);
            }
        }
        return null;
    }
    @GetMapping("/Funcionario por Cargo")
    public ArrayList<Funcionario> pesquisarFuncionarioPorCargo(String cargo){
        ArrayList<Funcionario> listaDeEncontrados= new ArrayList<>();
        for(int i=0; i<this.listaDeFuncionarios.size();i++){
            if(this.listaDeFuncionarios.get(i).getCargo().equalsIgnoreCase(cargo)){
                listaDeEncontrados.add(this.listaDeFuncionarios.get(i));
            }
        }
        return listaDeEncontrados;
    }

    public String listarFuncionario(){

        return null;
    }

    @Override
    public String toString() {
        return"\n"
                +"Nome: " + nome +"\n"
                +"CNPJ: " + cnpj +"\n"
                +"Lista de funcionarios: " + listaDeFuncionarios +"\n";
    }

}
