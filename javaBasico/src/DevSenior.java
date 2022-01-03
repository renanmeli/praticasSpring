public class DevSenior extends Funcionario{

    //atributos
    private Integer quantidadeSubordinados;

    //construtor
    public DevSenior(Long id, String nome, String endereco, Double salario, Integer quantidadeSubordinados) {
        super(id, nome, endereco, salario);
        this. quantidadeSubordinados = quantidadeSubordinados;
    }

    //encapsulamento
    public Integer getQuantidadeSubordinados() {
        return quantidadeSubordinados;
    }

    public void setQuantidadeSubordinados(Integer quantidadeSubordinados) {
        this.quantidadeSubordinados = quantidadeSubordinados;
    }

    //metodos
    @Override
    public Double calcularBonificacao(Double salarioBase) {
        return salarioBase*2;
    }

    @Override
    public String toString() {
        return "DevSenior{" + super.toString() +
                ", quantidadeSubordinados=" + quantidadeSubordinados +
                '}';
    }
}
