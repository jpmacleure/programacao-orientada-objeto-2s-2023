package exception.banco;

import java.util.ArrayList;

import exception.banco.exceptions.ContaNaoEncontradaException;
import exception.banco.exceptions.ValorDepositoInvalidoException;

public class Banco {
    
    private ArrayList<ContaCorrente> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nome, Integer numero){
        ContaCorrente conta = new ContaCorrente(nome, numero);
        this.contas.add(conta);
    }

    public ContaCorrente pesquisarConta(String nome){
        ContaCorrente contaEncontrada = null;
        
        for (ContaCorrente c : contas) {
            if(c.getNome().equals(nome)){
                contaEncontrada = c;
            }
        }
        return contaEncontrada;
    }

    public void depositar(String nomeConta, Double valorDeposito) throws Exception{
        
        if(valorDeposito <= 0){
            throw new ValorDepositoInvalidoException();
        }
        
        ContaCorrente contaDeposito = null;
        for (ContaCorrente c : contas) {
            if(c.getNome().equals(nomeConta)){
                contaDeposito = c;
            }
        }

        if(contaDeposito == null){
            throw new ContaNaoEncontradaException();
        }

    }

}
