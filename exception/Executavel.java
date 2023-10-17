package exception;

import exception.banco.Banco;
import exception.banco.exceptions.ContaNaoEncontradaException;
import exception.banco.exceptions.ValorDepositoInvalidoException;

public class Executavel {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        banco.abrirConta("conta 1", 1);
        try {
            banco.pesquisarConta("conta 1");
        }
        catch (NullPointerException e) {
            System.out.println("Existe conta com nome vazio");  
        }
        catch (Exception e) {
            System.out.println("Não foi possível pesquisar a conta. Tente novamente mais tarde.");  
        }

        try {
            banco.depositar("conta", 0.0);    
        } 
        catch (ValorDepositoInvalidoException e) {
            System.out.println("Deposite um valor válido, maior que 0.");
        } 
        catch (ContaNaoEncontradaException e) {
            System.out.println("Conta não encontrada. Informe uma conta válida.");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        
    }

}
