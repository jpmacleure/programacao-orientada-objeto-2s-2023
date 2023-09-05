package encapsulamento;

import java.math.BigDecimal;

public class Executavel {
    
    public static void main(String[] args) {
        
        ContaCorrente c1 = new ContaCorrente(123);
        ContaCorrente c2 = new ContaCorrente(124, new BigDecimal(100.00));
        ContaCorrente c3 = new ContaCorrente(125);
        
        c3.depositar(new BigDecimal(50));
        System.out.println("Saldo c2 = "+ c2.getSaldo());
        System.out.println("Saldo c3 = "+ c3.getSaldo());

        c2.transferirSaldo(c3, new BigDecimal(25));
        System.out.println("Saldo c2 = " + c2.getSaldo());
        System.out.println("Saldo c3 = " + c3.getSaldo());

        ContaCorrente.depositar(c2, new BigDecimal(25));
        System.out.println("Saldo c2 = " + c2.getSaldo());
        System.out.println("Saldo c3 = " + c3.getSaldo());
    }

}
