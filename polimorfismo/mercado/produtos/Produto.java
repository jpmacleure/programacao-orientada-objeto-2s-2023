package polimorfismo.mercado.produtos;

public abstract class Produto {
    
    protected String nome;
    protected Double preco;

    Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String imprimirNotaFiscal(){
        return this.nome + " - R$ " + this.preco;
    }

    public Double calcularValorTotal(){
        return this.preco;
    }

}
