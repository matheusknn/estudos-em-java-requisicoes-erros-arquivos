package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("está entre os preferidos do momento");
        }else if(classificavel.getClassificacao()>= 2) {
            System.out.println("muito bem avaliado");
        }else {
            System.out.println("coloque para assistir depois");
        }
    }
}
