package polimorfismo.mercado.produtos;

public class Melancia extends Produto implements ProdutoUnidade{

    private Integer unidades;

    public Melancia(String nome, Double preco, Integer unidades){
        super(nome, preco);
        this.unidades = unidades;
    }

    @Override
    public Double calcularPrecoUnidade() {
        return this.preco * this.unidades;
    }

    @Override
    public Double calcularValorTotal() {
        return calcularPrecoUnidade();
    }

    @Override
    public String imprimirNotaFiscal() {
        return this.nome + "(" + this.preco + ") - Un. " + this.unidades + " R$ " + calcularValorTotal();
    }
    
}
