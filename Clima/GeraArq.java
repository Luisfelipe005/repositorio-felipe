import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;


public class GeraArq {
    public void geraArquivo(Info info) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(info, Info.class);
            FileWriter writer = new FileWriter("Arquivo.json");
            writer.write(json);
            writer.close();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}