package polimorfismo;

import polimorfismo.mercado.CarrinhoDeCompras;
import polimorfismo.mercado.produtos.Alho;
import polimorfismo.mercado.produtos.Melancia;

public class Executavel {
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Alho a1 = new Alho("Alho comum", 1.99, 0.5);
        Melancia m1 = new Melancia("Melancia comum", 12.99, 2);
        carrinho.adicionarProduto(a1);
        carrinho.adicionarProduto(m1);

        System.out.println(carrinho.finalizarCompra());
    }

}
