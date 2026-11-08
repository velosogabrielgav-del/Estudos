package salaretangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private final double altura;
    private final double largura;

    public CalculadoraSalaRetangular(double altura, double largura) {
        if (altura > 0 && largura > 0) {
            this.altura = altura;
            this.largura = largura;
        } else {
            throw  new IllegalArgumentException("Valor não pode ser negativo e nem zero");
        }
    }

    @Override
    public double calcularArea() {
        double calcularArea = altura * largura;
        return calcularArea;

    }

    @Override
    public double calcularPerimetro() {
        double calcularPerimetro = 2 * (altura + largura);
        return calcularPerimetro;
    }
}
