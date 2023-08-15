package revisao;

/**
 * Calculadora
 */
public class Calculadora {

    private Integer a;
    private Integer b;
    private String operador;

    public Integer getA(){
        return this.a;
    }

    public void setA(Integer a){
        this.a = a;
    }

    public Integer getB(){
        return this.b;
    }

    public void setB(Integer b){
        this.b = b;
    }

    public String getOperador(){
        return this.operador;
    }

    public void setOperador(String op) throws Exception {
        Boolean err = true;
        switch (op) {
            case "+":
                err = false;
                break;
            case "-":
                err = false;
                break;
            case "*":
                err = false;
                break;
            case "/":
                err = false;
                break;
        }

        if(err){
            throw new Exception("Operador inválido");
        }

        this.operador = op;
    }

    public Integer operar(){
        Integer ret = 0;
        switch (this.operador) {
            case "+":
                ret = this.a + this.b;
                break;
            case "-":
                ret = this.a - this.b;
                break;
            case "*":
                ret = this.a * this.b;
                break;
            case "/":
                ret = this.a / this.b;
                break;
        }
        return ret;
    }
}