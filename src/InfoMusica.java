public class InfoMusica {
    public static void main(String[] args) {

        Musica musica1 = new Musica();

        musica1.artista = "Felipe ret";
        musica1.titulo = "Faça você mesmo";

        musica1.avaliacao(10);
        musica1.avaliacao(10);
        musica1.avaliacao(10);

        musica1.exibirFichaTecnica();
        System.out.println(musica1.mediaAvaliacoesMusica());
    }
}
