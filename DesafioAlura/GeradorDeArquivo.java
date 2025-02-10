import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class GeradorDeArquivo {

    public void GeraArquivo(Endereco endereco) throws IOException {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(endereco, Endereco.class);
            FileWriter writer = new FileWriter("Arquivo.json");
            writer.write(json);
            writer.close();
            System.out.println(json);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
