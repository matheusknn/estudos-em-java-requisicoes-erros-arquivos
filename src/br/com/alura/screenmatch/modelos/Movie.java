package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Movie extends Titulo implements Classificacao {
    private String director;

    public Movie(String nome, int releaseYear) {//construtora
       //em Java, um construtor é um método especial de uma classe que é utilizado para inicializar objetos dessa classe. Ele tem o mesmo nome da classe e não possui um tipo de retorno. Os construtores são chamados quando um objeto de uma classe é criado, e eles são usados para configurar o estado inicial do objeto.
       super(nome, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int)obterMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName();
    }
}
