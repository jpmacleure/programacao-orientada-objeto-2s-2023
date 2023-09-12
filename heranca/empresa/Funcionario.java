package heranca.empresa;

public class Funcionario {

    protected String nome;
    protected Integer cpf;
    protected Integer telfone;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelfone() {
        return this.telfone;
    }

    public void setTelfone(Integer telfone) {
        this.telfone = telfone;
    }

    public Double getSalario(){
        return 1000.00;
    }

    public Double getBonificacao(){
        return getSalario() * 0.05;
    }

}
