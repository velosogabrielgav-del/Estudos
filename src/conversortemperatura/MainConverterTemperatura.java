package conversortemperatura;

public class MainConverterTemperatura {
    public static void main(String[] args) {


        ConversorTemperatura conversorTemperatura = new ConversorTemperaturaPadrao();

        System.out.printf("25 celsius equivalem a %.2f°F%n",conversorTemperatura.celsiusParaFahrenheit(25));
        System.out.printf("77 fahrenheit equivalem a %.2f°C%n",conversorTemperatura.fahrenheitParaCelsius(77));



    }
}
