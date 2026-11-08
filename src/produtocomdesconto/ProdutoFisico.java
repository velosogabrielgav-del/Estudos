package produtocomdesconto;

public class ProdutoFisico implements Calculavel {

    private final double preco;
    private static final double desconto = 0.10;

    public ProdutoFisico(double preco) {
        this.preco = preco;

    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto);
    }
}
