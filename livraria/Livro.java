package livraria;

public class Livro {
    int id;
    String autor;
    String titulo;
    String anoDePublicacao;

    Livro (int id, String autor, String titulo, String anoDePublicacao){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    String imprimir(){
        String ret = "";
        ret = this.id + " - " + this.titulo + " - " + this.autor + " - " + this.anoDePublicacao;
        return ret;
    }

}
