package landarin.francis.projetoBiblioteca.Model;

public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    private double valorUnitario;




    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return"\n"
                +"Título:" + titulo +"\n"
                +"Gênero:" + genero +"\n"
                +"Autor:" + autor +"\n"
                +"valor:" + valorUnitario +"\n";
    }
}
