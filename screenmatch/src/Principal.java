public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avalia(8);

        meuFilme.exibeFicaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
