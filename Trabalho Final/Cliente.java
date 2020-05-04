package landarin.francis.projetogradle.model;

public class Cliente {

     private String nome;
     private String nascimento;
     private long cpf;
     private String email;
     private long cep;
     private String endereco;
     private int celular;

     // método construtor


    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "\n "
                +"nome=" + nome + "\n "
                +"idade=" + nascimento
                +"cpf=" + cpf + "\n"
                +"email=" + email + "\n"
                +"cep=" + cep + "\n"
                +"endereco=" + endereco + "\n"
                +"celular=" + celular ;
    }
}
