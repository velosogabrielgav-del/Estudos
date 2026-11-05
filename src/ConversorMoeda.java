public class ConversorMoeda implements ConversaoFinanceira{

    private static final double preco_Dolar = 5.50;
    private double quantiaEmDolar;

    public ConversorMoeda(double quantiaEmDolar) {
        this.quantiaEmDolar = quantiaEmDolar;
    }

    @Override
    public double converterDolarParaReal() {
        return quantiaEmDolar * preco_Dolar;
    }
}
