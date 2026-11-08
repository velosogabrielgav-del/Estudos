package mediaaluno;

public class InfoAluno {

    private String nome;
    private double[] notas;
    int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;
        for(double nota: notas){
            soma += nota;
        }
        return soma/notas.length;
    }

    void exibirDados(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " +idade);
    }

}
