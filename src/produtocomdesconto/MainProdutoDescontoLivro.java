package produtocomdesconto;

public class MainProdutoDescontoLivro {
    public static void main(String[] args) {

        Calculavel livroOnline = new Livro(100);
        System.out.printf("Preço do livro pela internet com taxa de entrega %.2f%n", livroOnline.calcularPrecoFinal());

        Calculavel produtofisico = new ProdutoFisico(100);
        System.out.printf("Preço do livro na loja fisica %.2f%n", produtofisico.calcularPrecoFinal());
    }
}
