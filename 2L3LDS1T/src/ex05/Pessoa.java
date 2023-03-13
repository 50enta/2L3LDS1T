package ex05;

public class Pessoa {

    private String nome;
    private String bi;
    private String genero;
    private String celular;

    public Pessoa(String nome, String bi, String genero, String celular) {
        this.setBi(bi);
        this.setNome(nome);
        this.setCelular(celular);
        this.setGenero(genero);
    }

    public boolean setNome(String nome) {
        if (nome.length() <= 2) {
            return false;
        }
        this.nome = nome;
        return true;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public String getBi() {

        return bi;
    }

    public String getGenero() {
        return genero;
    }

    public String getCelular() {
        return celular;
    }


}
