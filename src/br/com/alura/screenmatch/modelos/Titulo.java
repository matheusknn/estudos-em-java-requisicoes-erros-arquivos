package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    //CLASSE: a classe especifica o conteúdo de um objeto, ou seja
    //ela é um molde para os atributos do objeto
    //ABSTRAÇÃO: consiste em esconder os detalhes desnecessários
    //de uma classe ou objeto, focando apenas nas características
    //mais importãntes para sua aplicação

    private String name; // O modificador public indica que o elemento ao qual ele é aplicado é acessível por qualquer classe em qualquer pacote

    private int releaseYear;
    private boolean includedInThePlan;
    private int totalReviews;//private: o atributo ou método só pode ser acessado dentro da própria classe.
    private int durationInMinutes;
    private double somaAvaliacoes; //private: o atributo ou método só pode ser acessado dentro da própria classe.

    //ENCAPSULAMENTO: consiste em esconder os detalhes internos de uma classe
    // ,protegendo seus atributos e métodos de serem acessados ou modificadoS
    // diretamente por outras classes
    //MÉTODOS: são funções que executam blocos de código

    //MÉTODO ACESSOR: usadado para acesssar informação de um atributo privado
    //na classe


    public Titulo(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.name = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("String ano não conseguiu ser convertida em int, pois possui mais de 4 caracteres");
        }
        this.releaseYear = Integer.valueOf(meuTituloOmdb.year());
        this.durationInMinutes = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalReviews() {
        return totalReviews;
    }
    public void displayTechnicalSheet(){//void = método não retorna nada
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalReviews++;
    }

    public double obterMedia() {
        return somaAvaliacoes/totalReviews;
    }

    //Setters: são métodos utilizados para definir o valor do tributo
    //de uma classe. A ideia dos getters e setters é promover o encapsulamento
    public void setName(String n) {
        this.name = n;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear + "," + durationInMinutes +
                '}';
    }
}
