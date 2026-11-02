public class Produto {
    public static void main(String[] args) {

        InfoProduto produto = new InfoProduto("Netflix", 59.9);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());

        produto.aplicarDesconto(50);
        System.out.println("Produto com desconto: " + produto.getPreco());

    }

}
