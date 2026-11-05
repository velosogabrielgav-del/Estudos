public class MainMoeda {
    public static void main(String[] args) {

        ConversaoFinanceira conversor = new ConversorMoeda(100);
        System.out.println("Valor : " +conversor.converterDolarParaReal());
    }
}
