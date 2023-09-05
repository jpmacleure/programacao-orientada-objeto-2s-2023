package encapsulamento;

import java.math.BigDecimal;

public class ContaCorrente {
    private Integer numeroDaConta;
    private BigDecimal saldo;

    public ContaCorrente() {
        this.setSaldo(new BigDecimal(0));
    }

    public ContaCorrente(Integer numero) {
        this.setNumeroDaConta(numero);
    }

    public ContaCorrente(Integer numero, BigDecimal saldo) {
        this.setNumeroDaConta(numero);
        this.setSaldo(saldo);
    }

    public Integer getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    private void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void transferirSaldo(ContaCorrente contaDestino, BigDecimal valorTransferencia) {
        if(this.getSaldo().compareTo(valorTransferencia) >= 0){
            this.setSaldo(this.getSaldo().subtract(valorTransferencia));
            contaDestino.setSaldo(contaDestino.getSaldo().add(valorTransferencia));
        }
    }

    public void depositar(BigDecimal valorDeposito){
        if(valorDeposito.compareTo(new BigDecimal(0)) == 1){            
            this.setSaldo(this.getSaldo().add(valorDeposito));
        }
    }

    public static void depositar(ContaCorrente contaDeposito, BigDecimal valorDeposito){
        if(valorDeposito.compareTo(new BigDecimal(0)) == 1){            
            contaDeposito.setSaldo(contaDeposito.getSaldo().add(valorDeposito));
        }
    }

}
