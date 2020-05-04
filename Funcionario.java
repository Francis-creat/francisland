package landarin.francis.projetoEmpresa.model;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private long cpf;
    private String cargo;
    private double salario;
    private ArrayList<Endereco> listaDeEnderecos;

    public Funcionario(){
        this.listaDeEnderecos= new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Endereco> getListaDeEnderecos() {
        return listaDeEnderecos;
    }

    public void setListaDeEnderecos(ArrayList<Endereco> listaDeEnderecos) {
        this.listaDeEnderecos = listaDeEnderecos;
    }

    @Override
    public String toString() {
        return"\n"
                +"Nome: " + nome +"\n"
                +"CPF: " + cpf +"\n"
                +"Cargo: " + cargo +"\n"
                +"Salário: " + salario +"\n"
                +"Lista de endereços: " + listaDeEnderecos +"\n";
    }

}
