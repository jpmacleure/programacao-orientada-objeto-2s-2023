package polimorfismo.mercado.produtos;

public class Alho extends Produto implements ProdutoGranel{

    private Double peso;

    public Alho(String nome, Double preco, Double peso){
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public Double calcularPrecoPeso() {
        return this.preco * this.peso;
    } 

    @Override
    public Double calcularValorTotal() {
        return calcularPrecoPeso();
    }

    @Override
    public String imprimirNotaFiscal() {
        return this.nome + "(" + this.preco + ") - Kg " + this.peso + " R$ " + calcularValorTotal();
    }

}
