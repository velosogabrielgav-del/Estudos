package produtocomdesconto;

public class Livro implements Calculavel {
    private final double preco;
    private static final double taxa = 0.10;

    public Livro(double preco) {
        this.preco = preco;

    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * taxa);
    }

}
