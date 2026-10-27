public class Musica {
    public static void main(String[] args) {

        InfoMusica musica1 = new InfoMusica();

        musica1.artista = "Felipe ret";
        musica1.titulo = "Faça você mesmo";

        musica1.avaliacao(10);
        musica1.avaliacao(10);
        musica1.avaliacao(10);

        musica1.exibirFichaTecnica();
        System.out.println("Media das Avaliações : " +musica1.mediaAvaliacoesMusica());
        System.out.println("Total de Avaliações : " +musica1.totalAvaliacao);
    }
}
