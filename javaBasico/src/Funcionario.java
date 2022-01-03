public abstract class Funcionario {

    //atributos
    private Long id;
    private String nome;
    private String endereco;
    private Double salario;

    //construtor
    public Funcionario(Long id, String nome, String endereco, Double salario) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    //encapsulamento
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //metodos pessoais da classe
    public abstract Double calcularBonificacao(Double salarioBase);

    @Override
    public String toString() {
        return  "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario;
    }
}
