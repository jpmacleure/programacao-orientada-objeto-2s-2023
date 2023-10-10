package collections;

import java.util.Vector;

public class ExemploVector {
    
    public static void main(String[] args) {
        
        Vector<String> frutas = new Vector<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Pêra");

        System.out.println(frutas.get(0));

        if(frutas.contains("Banana")){
            System.out.println("Banana está na lista");
        }

        frutas.remove("Banana");

        if(!frutas.contains("Banana")){
            System.out.println("Banana NÃO está na lista");
        }

        frutas.clear();
        if(frutas.isEmpty()){
            System.out.println("A lista está vazia");
        }

    }

}
