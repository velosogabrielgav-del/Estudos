package menorprecocarro;

public class ModeloCarro extends Carro{
    static void main(String[] args) {

        Carro carro = new Carro();

        carro.setPreco(new double[]{1000.0,2000.0,3000.0});

        System.out.println("menor preço: "+carro.menorPreco());



    }
}
