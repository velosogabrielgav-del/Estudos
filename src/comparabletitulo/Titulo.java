package comparabletitulo;

public class Titulo implements Comparable<Titulo>{

    private String titulo;
    private String descricao;

    public Titulo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public int compareTo(Titulo outro) {
        return this.titulo.compareTo(outro.titulo);
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo + " descricao: " + this.descricao;
    }
}


