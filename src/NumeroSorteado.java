import java.util.Random;
import java.util.Scanner;

public class NumeroSorteado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(101);
        int tentativas = 0;
        int numero = 0;

        while (tentativas <5) {
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            tentativas++;

            if (numero == numeroSorteado) {
                System.out.println("Parabens");
                break;
            } else if (numero < numeroSorteado) {
                System.out.println("Dica: o numero sorteado é maior que " +numero);
            }else {
                System.out.println("Dica: o numero sorteado é menor que " +numero);
            }

        }
        if (tentativas == 5 && numero != numeroSorteado){
            System.out.println("Você errou todas as tentativas. O numero era "+numeroSorteado);
        }

        }




    }

