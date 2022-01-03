import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(new DevJunior(1L, "Renan", "Osasco", 2000.0, 40));
        funcionarioList.add(new DevJunior(1L, "Davi", "Sao Paulo", 2000.0, 40));
        funcionarioList.add(new DevSenior(1L, "Tauane", "Osasco", 5000.0, 10));
        funcionarioList.add(new DevSenior(1L, "Rodrigo", "Osasco", 5000.0, 8));

        for(Funcionario f : funcionarioList){
            System.out.println(f.toString());
        }

        System.out.println("******************************************************");

        for(Funcionario f : funcionarioList){
            System.out.println(f.getNome() + " " + f.calcularBonificacao(f.getSalario()));
        }
    }
}
