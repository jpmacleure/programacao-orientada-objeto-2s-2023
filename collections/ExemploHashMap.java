package collections;

import java.util.HashMap;

public class ExemploHashMap {
    
    public static void main(String[] args) {
        
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("França", "Paris");
        capitais.put("Japão", "Tóquio");

        System.out.println(capitais.get("Brasil"));

        if(capitais.containsKey("França")){
            System.out.println("A capital da França está no HashMap");
        }

        for (String chave : capitais.keySet()) {
            System.out.println(chave + " - " + capitais.get(chave));
        }

    }

}
