package salaretangular;

public class MainGeometrico {
    public static void main(String[] args) {

        CalculoGeometrico calculo = new CalculadoraSalaRetangular(-10,20);


        System.out.println("Area: " + calculo.calcularArea());
        System.out.println("Perimetro: " + calculo.calcularPerimetro());

    }
}
