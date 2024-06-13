public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFicaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano? " + incluidoNoPlano);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração: " + duracaoEmMinutos);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
