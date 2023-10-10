package collections;

import java.util.ArrayList;

public class ExemploArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> listaDeNome = new ArrayList<>();

        listaDeNome.add("Alice");
        listaDeNome.add("Bob");
        listaDeNome.add("Carol");

        System.out.println(listaDeNome.get(1));

        for (String nome : listaDeNome) {
            System.out.println(nome);
        }

        if(listaDeNome.contains("Carol")){
            System.out.println("Carol está na lista");
        }

        listaDeNome.remove("Carol");

        if(!listaDeNome.contains("Carol")){
            System.out.println("Carol NÃO está na lista");
        }

        listaDeNome.clear();
        if(listaDeNome.isEmpty()){
            System.out.println("A lista está vazia");
        }

    }

}
