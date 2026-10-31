public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(12345);
        conta.setSaldo(-10);
        conta.titular = "Gabriel";


        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);
    }
}
