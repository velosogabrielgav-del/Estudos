public class Aluno {
    public static void main(String[] args) {

        InfoAluno aluno = new InfoAluno();

        aluno.setNome("gabriel");
        aluno.setNotas(new double[]{10.0, 4.0});

        double media = aluno.calcularMedia();
        System.out.println("Media: " + media);

    }
}
