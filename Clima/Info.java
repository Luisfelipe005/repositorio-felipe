
import com.google.gson.*;

import java.util.List;

public class Info {
    private List<JsonObject> weather;
    private String name;
    private JsonObject sys;

    public JsonObject getSys() {
        return sys;
    }

    public List<JsonObject> getWeather() {
        return weather;
    }

    public String getName() {
        return name;
    }

    public String retorna(){
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .create();
        return
        "Clima: " + gson.toJson(getWeather()) + "\n" +
        "Nome Da Cidade: " + gson.toJson(getName()) + "\n" +
        "País: " + getSys().get("country");
    }
}