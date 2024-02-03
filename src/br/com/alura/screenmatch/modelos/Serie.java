package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    /*Herança permite que uma classe herde os atributos e métodos de
    outra classe, promovendo a reutilização de código e a criação de
    uma hierarquia de classes. A classe que é herdada é chamada de
    classe pai ou superclasse, e a classe que herda é chamada de classe
     filha ou subclasse. Usando a palavra chave extends, dizemos que é
     uma subclasse que herdará algo de uma superclasse*/
    private int temporadas;
    private boolean ativa;
    private int episodeosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodeosPorTemporada(int episodeosPorTemporada) {
        this.episodeosPorTemporada = episodeosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodeosPorTemporada() {
        return episodeosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override //opcional diz que está pegando método da classe mãe
    public int getDurationInMinutes() {
        return  temporadas * episodeosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getName();
    }
}

