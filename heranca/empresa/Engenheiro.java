package heranca.empresa;

public class Engenheiro extends Funcionario{
    
    private Integer crea;
    private String projeto; 

    public Engenheiro(String nome, Integer cpf, Integer telfone, Integer crea, String projeto) {
        this.nome = nome;
        this.cpf = cpf;
        this.telfone = telfone;
        this.crea = crea;
        this.projeto = projeto;
    }

    public Integer getCrea() {
        return this.crea;
    }

    public void setCrea(Integer crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    
    @Override
    public Double getSalario(){
        return 10000.00;
    }

    @Override
    public Double getBonificacao(){
        return getSalario() * 0.15;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telfone='" + getTelfone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }


}
