public class Movie {
    //CLASSE: a classe especifica o conteúdo de um objeto, ou seja
    //ela é um molde para os atributos do objeto
    //ABSTRAÇÃO: consiste em esconder os detalhes desnecessários
    //de uma classe ou objeto, focando apenas nas características
    //mais importãntes para sua aplicação
    String name;
    int releaseYear;
    boolean includedInThePlan;
    private int totalReviews;//private: o atributo ou método só pode ser acessado dentro da própria classe.
    int durationInMinutes;
    private double somaAvaliacoes; //private: o atributo ou método só pode ser acessado dentro da própria classe.

    //ENCAPSULAMENTO: consiste em esconder os detalhes internos de uma classe
    // ,protegendo seus atributos e métodos de serem acessados ou modificadoS
    // diretamente por outras classes
    //MÉTODOS: são funções que executam blocos de código

    //MÉTODO ACESSOR: usadado para acesssar informação de um atributo privado
    //na classe
    int getTotalReviews() {
        return totalReviews;
    }
    void displayTechnicalSheet(){//void = método não retorna nada
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalReviews++;
    }

    double obterMedia() {
        return somaAvaliacoes/totalReviews;
    }

}
