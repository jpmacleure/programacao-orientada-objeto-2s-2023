package heranca.empresa;

public class Gerente extends Funcionario{
 
    private Integer quantidadeGerenciados;

    public Gerente(String nome, Integer cpf, Integer telfone, Integer quantidadeGerenciados) {
        this.nome = nome;
        this.cpf = cpf;
        this.telfone = telfone;
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }
    
    @Override
    public Double getSalario(){
        return 15000.00;
    }

    @Override
    public Double getBonificacao(){
        return getSalario() * 0.25;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telfone='" + getTelfone() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }



}
