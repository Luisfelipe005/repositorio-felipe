import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaClima {
    public Info consultadorDeClima(String cidade, String estado) throws URISyntaxException, IOException, InterruptedException {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://open-weather13.p.rapidapi.com/city/"+cidade+"/"+estado))
                    .header("x-rapidapi-key", "607d4e3a30msh73b287ccc34eeecp1b3357jsnd0ba56735c07")
                    .header("x-rapidapi-host", "open-weather13.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
           return new Gson().fromJson(response.body(), Info.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}