package ex05;
//5. Faça um programa para controle de empréstimo de livros, 
//com as classes Empréstimo, Livro e Pessoa.

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Clayton", "11034673H", "Feminino", "846756322");
        Pessoa p2 = new Pessoa("Hércio", "11034683H", "Feminino", "826756322");

        Livro l1 = new Livro("Amor e Trovão", "Valter Sitoe", "Romance", "2010");
        Livro l2 = new Livro("Amor e Ódio", "Mathumbo", "Romance", "2011");

        Emprestimo e1 = new Emprestimo(new Date(), l2, p2);
        System.out.println(e1);
        System.out.println(e1.devolver(new Date()));
        System.out.println(e1);

    }
}
