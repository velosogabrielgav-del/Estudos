import java.util.Scanner;

public class AreaQuadradaCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("""
                Escolha 1 para calcular a área do quadrado
                Escolha 2 para calcular a área do circulo
                """);
        escolha = scanner.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("Qual o lado do quadrado? ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.printf("A area do quadrado é : %.2f%n", areaQuadrado);
                break;

            case 2:
                System.out.println("Qual o raio do circulo? ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.printf("A area do circulo é: %.2f%n", areaCirculo);
                break;
            default:
                System.out.println("Opção invalida");

        }
        scanner.close();
    }
}
