package heranca;

import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Funcionario;
import heranca.empresa.Gerente;

public class Executavel {

    public static void main(String[] args) {

        Engenheiro eng1 = new Engenheiro("Jota", 123, 61999, 123, "POO 1");
        Engenheiro eng2 = new Engenheiro("Peu", 124, 61998, 124, "POO 2");
        Gerente g1 = new Gerente("Joao", 125, 61997, 2);
        Diretor d1 = new Diretor("Pedro", 126, 61996, 1);

        imprimirFuncionario(g1);
    }

    public static void imprimirFuncionario(Funcionario f){
        System.out.println(f);
    }

}
