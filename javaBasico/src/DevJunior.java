public class DevJunior extends Funcionario {

    //atributos
    private Integer cargaHorariaSemanal;

    //construtor
    public DevJunior(Long id, String nome, String endereco, Double salario, Integer cargaHorariaSemanal) {
        super(id, nome, endereco, salario);
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    //encapsulamento
    public Integer getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(Integer cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    //metodos
    @Override
    public Double calcularBonificacao(Double salarioBase) {
        return salarioBase*1.5;
    }

    @Override
    public String toString() {
        return "DevJunior{" + super.toString() +
                ", cargaHorariaSemanal=" + cargaHorariaSemanal +
                '}';
    }
}
