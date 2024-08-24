import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Livraria livro = new Livraria();

        System.out.print("Quantos livros deseja adicionar? ");
        int quantidade = sc.nextInt();
        while (quantidade > 5) {
            System.out.println("Você pode adicionar até 5 livros.");
            quantidade = sc.nextInt();
        }
        System.out.println();

        for (int contador = 1; contador <= quantidade; contador++) {
            System.out.print("Informe o autor do livro " + contador + ": ");
            String definirAutor = sc.next();
            livro.setDefinirAutor(definirAutor);

            System.out.print("Informe o título do livro de " + definirAutor + ": ");
            String definirTitulo = sc.next();
            livro.setDefinirTitulo(definirTitulo);

            System.out.print("Informe a edição do livro: ");
            int definirEdicao = sc.nextInt();
            livro.setDefinirEdicao(definirEdicao);

            System.out.print("Informe a editora: ");
            String definirEditora = sc.next();
            livro.setDefinirEditora(definirEditora);
            
            System.out.print("Informe o ano de publicação: ");
            int definirAnoDePublicacao = sc.nextInt();
            livro.setDefinirAnoDePublicacao(definirAnoDePublicacao);

            System.out.print("Qual é o assunto principal do livro? ");
            String definirAssuntoPrinciapl = sc.next();
            livro.setDefinirAssuntoPrincipal(definirAssuntoPrinciapl);
            
            System.out.println();
            System.out.println("A etiqueta do livro será 00" + contador + ".");
            System.out.println(livro.getVerLivro());
            System.out.println();
        }
        sc.close();
    
    }

}