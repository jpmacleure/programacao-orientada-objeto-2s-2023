package teste.aula1;

import revisao.Calculadora;

public class CalculadoraTeste {
    
    public static void main(String[] args){
        
        Calculadora calc = new Calculadora();

        calc.setA(3);
        calc.setB(5);
        try {
            calc.setOperador("+");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(calc.operar());

    }

}
