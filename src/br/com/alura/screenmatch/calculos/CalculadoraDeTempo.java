package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void timeCalculator(Movie f){
//        this.tempoTotal += f.getDurationInMinutes();
//    }
//
//    public void timeCalculator(Serie s){
//        this.tempoTotal += s.getDurationInMinutes();
//    }

    //Polimorfismo: capacidade se um objeto instanciado por uma classe ser tratado de forma igual
    //com nomes diferentes, nesse caso séries e filmes são um titulo
    public void timeCalculator(Titulo titulo){
        this.tempoTotal += titulo.getDurationInMinutes();
    }
}
