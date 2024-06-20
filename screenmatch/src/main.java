public class main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());


        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carowl");
        pessoa1.setIdade(22);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Camila");
        pessoa2.setIdade(17);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificaIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificaIdade();


        Produto produto1 = new Produto();
        produto1.setNome("Cebola");
        produto1.setPreco(9.45);

        Produto produto2 = new Produto();
        produto2.setNome("tomate");
        produto2.setPreco(14.88);
        produto2.aplicarDesconto(50);

        System.out.println("Você comprou "+produto1.getNome()+" por: "+produto1.getPreco()+" e "+produto2.getNome()+" por: "+produto2.getPreco()+".\nTotalizando: R$"+(produto1.getPreco()+ produto2.getPreco()));

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lulu");
        aluno1.setNota1(7.50);
        aluno1.setNota2(8.00);
        aluno1.setNota3(9.50);
        aluno1.setNota4(4.75);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Karina");
        aluno2.setNota1(6.00);
        aluno2.setNota2(7.00);
        aluno2.setNota3(7.00);
        aluno2.setNota4(7.00);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Nota 4: " + aluno1.getNota4());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Nota 4: " + aluno2.getNota4());
        System.out.println("Média: " + aluno2.calcularMedia());


        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
