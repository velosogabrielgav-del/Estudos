package conectandoapi;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalApiBook {
    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = System.getenv("GOOGLE_BOOKS_API_KEY");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        var nomeLivro = scanner.nextLine();

        String correcao = URLEncoder.encode(nomeLivro, StandardCharsets.UTF_8);

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" +correcao+"&key="+ apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
