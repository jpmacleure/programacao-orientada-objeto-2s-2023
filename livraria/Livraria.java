package livraria;

import java.util.ArrayList;

public class Livraria {
    
    ArrayList<Livro> livros;

    Livraria(){
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro l){
        this.livros.add(l);
    }

    public String listarLivros(){
        String listaLivros = "";

        for (Livro l : this.livros) {
            listaLivros += l.imprimir() + "\n";
        }

        return listaLivros;
    }

    public String buscarLivroPorId(int id){
        String ret = "Livro não encontrado.";

        for (Livro l : this.livros) {
            if(l.id == id){
                ret = l.imprimir();
            }
        }

        return ret;
    }

}
