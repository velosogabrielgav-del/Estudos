public class Carro {

    private String nome;
    private double[] preco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getPreco() {
        return preco;
    }

    public void setPreco(double[] preco) {
        this.preco = preco;
    }

    public double menorPreco(){
        double menor = preco[0];
        for (int i = 0; i < preco.length; i++) {
            if (preco[i] < menor){
                menor = preco[i];

            }

        }return menor;
    }
}

