public class InfoCarro {

    String modelo;
    String cor;
    int anoDoCarro;
    int anoAtual = 2026;


    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + anoDoCarro);

    }

    int anoCarro() {
        return anoAtual - anoDoCarro;
    }
}
