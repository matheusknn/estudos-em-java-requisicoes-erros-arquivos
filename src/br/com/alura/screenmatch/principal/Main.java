import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //criando variável de referêmcia na memória que aponta
        //para um objeto
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        ;//atributo
        myMovie.setDurationInMinutes(180);//atributo
        // Uma instância de uma classe é um novo objeto criado dessa classe,
        // com o operador new. Instanciar uma classe é criar um novo objeto do
        // mesmo tipo dessa classe
        myMovie.displayTechnicalSheet();
        myMovie.avalia(4);
        myMovie.avalia(6);
        myMovie.avalia(10);
        System.out.println(myMovie.getTotalReviews());
        //
        Serie serie = new Serie("lost", 2000);
        serie.setName("lost");
        serie.setReleaseYear(2000);
        serie.displayTechnicalSheet();
        serie.setTemporadas(10);
        serie.setEpisodeosPorTemporada(10);
        serie.setMinutosPorEpisodio(60);
        System.out.println(serie.getDurationInMinutes());

        Movie outroFilme = new Movie("Avatar", 2000);
        outroFilme.setDurationInMinutes(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.timeCalculator(myMovie);
        System.out.println(calculadora.getTempoTotal());
        calculadora.timeCalculator(outroFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.timeCalculator(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        //java 10, var permite que o compilador infira automaticamente o tipo da
        //variável com base no valor atribuído a ela
        var filmeDoKenji = new Movie("tomando pika", 2002);
        filmeDoKenji.setDurationInMinutes(200);
        filmeDoKenji.setName("tomando pika");
        filmeDoKenji.avalia(10);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoKenji);
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        //A classe Object é a superclasse de todas às classes escritas em seu
        //projeto Java, logo, todos os métodos de Object podem ser usados

        //Construtor: método que tem como função a criação de um objeto
        //em memória
    }
}
