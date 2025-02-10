import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco ConsultarCep(String cep) throws IOException, InterruptedException {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (new Gson().fromJson(response.body(), Endereco.class).cep() == null) {
                throw new ErroCepInexistente("Erro! CEP inexistente!");
            }
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (ErroCepInexistente e) {
            System.out.println(e.getMenssagem());
        } catch (JsonSyntaxException e) {
            System.out.println("Erro! o CEP deve conter 8 digitos!");
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado!");
        }
        return null;
    }
}