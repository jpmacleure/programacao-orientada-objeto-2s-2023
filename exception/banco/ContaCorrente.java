package exception.banco;

public class ContaCorrente {
    
    private String nome;
    private Integer numero;
    private Double saldo;

    private ContaCorrente(){}

    public ContaCorrente(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
