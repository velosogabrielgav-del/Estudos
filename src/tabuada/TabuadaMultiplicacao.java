package tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private final int  numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }
}