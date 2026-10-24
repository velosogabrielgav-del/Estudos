import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();

        if(numero == 0) {
            System.out.println("Esse numero é zero");

        } else if (numero < 0) {
            System.out.println("Numero negativo");
        }else {
            System.out.println("Numero positivo");
        }

    }
}
