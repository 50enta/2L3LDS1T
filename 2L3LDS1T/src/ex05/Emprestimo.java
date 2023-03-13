package ex05;

import java.util.Date;

public class Emprestimo {

    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean devolvido;
    private Livro livro;
    private Pessoa pessoa;

    public Emprestimo() {
        this.setDevolvido(false);
        this.emprestar(dataEmprestimo);
    }

    public Emprestimo(Date dataEmprestimo, Livro livro, Pessoa pessoa) {
        this.setDataEmprestimo(dataEmprestimo);
        this.setDevolvido(false);
        this.setPessoa(pessoa);
        this.emprestar(dataEmprestimo);
    }

    public boolean emprestar(Date dataEmprestimo) {
        if (!this.isDevolvido()) {
            this.setDataEmprestimo(dataEmprestimo);
            this.setDevolvido(false);
            return true;
        }
        return false;
    }
    
        public boolean emprestar(int ano, int mes, int dia) {
//extrair os dados para formar a data
        if (!this.isDevolvido()) {
            this.setDataEmprestimo(dataEmprestimo);
            this.setDevolvido(false);
            return true;
        }
        return false;
    }

    public boolean emprestar(String data) {
//extrair os dados para formar a data
        if (!this.isDevolvido()) {
            this.setDataEmprestimo(dataEmprestimo);
            this.setDevolvido(false);
            return true;
        }
        return false;
    }

    public boolean devolver(Date dataDevolucao) {
        if (!this.isDevolvido()) {
            this.setDataDevolucao(dataDevolucao);
            this.setDevolvido(true);
            return true;
        }
        return false;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
//        return this.getDataDevolucao() + "\n " + this.getLivro().getTitulo() + "\n " + this.dataEmprestimo;
        return this.isDevolvido() + "";
    }

}
