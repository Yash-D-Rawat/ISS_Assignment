package JSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDemo {
    public static void main(String[] args) {

        // Create JSON Object
        JSONObject trainer = new JSONObject();

        trainer.put("trainerId", 1);
        trainer.put("trainerName", "Yash");
        trainer.put("region", "Mumbai");
        trainer.put("active", true);

        // Nested JSONObject
        JSONObject stats = new JSONObject();
        stats.put("badges", 5);
        stats.put("experience", 1200);

        trainer.put("stats", stats);

        // JSON Array
        JSONArray pokemonList = new JSONArray();
        pokemonList.put("Pikachu");
        pokemonList.put("Charizard");
        pokemonList.put("Gengar");

        trainer.put("pokemons", pokemonList);

        // Print formatted JSON
        System.out.println(trainer.toString(4));

        int id = trainer.getInt("trainerId");
        String name = trainer.getString("trainerName");
        boolean active = trainer.getBoolean("active");

// Nested object read
        JSONObject statObj = trainer.getJSONObject("stats");
        int badges = statObj.getInt("badges");

// Array read
        JSONArray arr = trainer.getJSONArray("pokemons");
        String firstPokemon = arr.getString(0);
        // Remove key

        trainer.getJSONObject("stats")
                .remove("badges");

        for (String key : trainer.keySet()) {
            System.out.println(key + " : " + trainer.get(key));
        }

    }
}
