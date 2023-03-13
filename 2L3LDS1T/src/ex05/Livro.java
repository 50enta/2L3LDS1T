
package ex05;


public class Livro {
    
    private String titulo;
    private String autor;
    private String categoria;
    private String ano;
    
    public Livro(String titulo, String autor, String categoria, String ano) {
        this.setAno(ano);
        this.setAutor(autor);
        this.setCategoria(categoria);
        this.setTitulo(titulo);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getAno() {
        return ano;
    }
    
    public void setAno(String ano) {
        this.ano = ano;
    }
    
}
