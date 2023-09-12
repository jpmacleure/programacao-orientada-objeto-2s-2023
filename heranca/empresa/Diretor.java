package heranca.empresa;

public class Diretor extends Funcionario{
    
    private Integer quantidadeGerencias;

    public Diretor(String nome, Integer cpf, Integer telfone, Integer quantidadeGerencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telfone = telfone;
        this.quantidadeGerencias = quantidadeGerencias;
    }

    public Integer getQuantidadeGerencias() {
        return this.quantidadeGerencias;
    }

    public void setQuantidadeGerencias(Integer quantidadeGerencias) {
        this.quantidadeGerencias = quantidadeGerencias;
    }
    
    @Override
    public Double getSalario(){
        return 30000.00;
    }

    @Override
    public Double getBonificacao(){
        return getSalario() * 0.40;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telfone='" + getTelfone() + "'" +
            ", quantidadeGerencias='" + getQuantidadeGerencias() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }


}
