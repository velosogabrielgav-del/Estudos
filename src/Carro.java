public class Carro {
    public static void main(String[] args) {

        InfoCarro carro1 = new InfoCarro();

        carro1.modelo = "Fiat uno";
        carro1.cor = "Preto";
        carro1.anoDoCarro = 2021;


        carro1.exibirFichaTecnica();
        System.out.println("O carro tem : " +carro1.anoCarro()+ " anos");
    }
}
