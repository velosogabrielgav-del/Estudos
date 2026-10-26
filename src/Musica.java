public class Musica {

    String titulo;
    String artista;
    int anolancamento;
    double somaAvaliacao;
    int totalAvaliacao;

    void exibirFichaTecnica(){
        System.out.println("Artista: " + artista);
        System.out.println("Titulo: " + titulo);
    }

    void avaliacao(double nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    double mediaAvaliacoesMusica(){
        return somaAvaliacao / totalAvaliacao;
    }


}
