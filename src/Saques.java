import java.util.Locale;
import java.util.Scanner;

public class Saques {

    static final String ROSA = "\u001B[1;38;5;197m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println();
        System.out.println(ROSA + "***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println(String.format(new Locale("pt", "BR"), "Saldo inicial: R$ %.2f", saldo));
        System.out.println("***********************" + RESET);
        System.out.println();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println(String.format(new Locale("pt", "BR"),
                            "Saldo atual: R$ %.2f", saldo));
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: ");
                    double valorRecebido = scanner.nextDouble();
                    if (valorRecebido > 0) {
                        saldo += valorRecebido;
                        System.out.println(String.format(new Locale("pt", "BR"),
                                "Saldo atualizado: R$ %.2f", saldo));
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;
                case 3:
                    System.out.print("Informe o valor a transferir: ");
                    double valorTransferido = scanner.nextDouble();
                    if (valorTransferido <= 0) {
                        System.out.println("Valor inválido!");
                    } else if (valorTransferido > saldo) {
                        System.out.println("Não há saldo suficiente para completar a operação!");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println(String.format(new Locale("pt", "BR"),
                                "Saldo atualizado: R$ %.2f", saldo));
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        }

        scanner.close();
    }
}
