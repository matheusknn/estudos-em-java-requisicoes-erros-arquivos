package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie poderosoChefao = new Movie("O Poderoso Chefão", 2000);
        poderosoChefao.avalia(10);
        Movie avatar = new Movie("Avatar", 2001);
        avatar.avalia(6);
        var minhaVida = new Movie("Sede De Mudança", 2024);
        minhaVida.avalia(9);
        Serie lost = new Serie("Lost", 2233);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add((poderosoChefao));
        listaDeAssistidos.add(avatar);
        listaDeAssistidos.add(minhaVida);
        listaDeAssistidos.add(lost);

        for (Titulo itemLista: listaDeAssistidos) {
            System.out.println(itemLista.getName());
            if(itemLista instanceof Movie filme && filme.getClassificacao() > 2) {//verificando se item é filme ou série para evitar excessão
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        //ORDENANDO LISTAS:
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Zac");
        buscaPorArtista.add("Kenji");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);//ordenando por ordem alfabética
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getReleaseYear));
        System.out.println((listaDeAssistidos));
    }
}
