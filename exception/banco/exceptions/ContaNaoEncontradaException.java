package exception.banco.exceptions;

public class ContaNaoEncontradaException extends Exception{
    
    public ContaNaoEncontradaException(){
        super("Conta Corrente não encontrada!");
    }

}
