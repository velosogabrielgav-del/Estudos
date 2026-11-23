package conectandoapi;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalApiCripto {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cripto para saber o valor dela: ");
        String cripto = scanner.nextLine().trim().toLowerCase();

        String criptoCodificada = URLEncoder.encode(cripto, StandardCharsets.UTF_8);


        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoCodificada + "&vs_currencies=brl";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
