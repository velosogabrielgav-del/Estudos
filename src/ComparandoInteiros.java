import java.util.Scanner;

public class ComparandoInteiros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Numeros iguais");
        } else if (numero1 < numero2) {
            System.out.println("Numero diferentes, o primeiro numero "+numero1+" é menor que o segundo numero: "+numero2);
        }else {
            System.out.println("Numero diferentes, o primeiro numero "+numero1+" é maior que o segundo numero: "+numero2);
        }

    }
}
