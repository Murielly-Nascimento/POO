package código;

public class Gerente extends Funcionario implements Imprimivel {
	
	public Gerente(String nome, String matricula, double salario_base) {
		super(nome, matricula, salario_base);
	}
	
	double calculaSalario() {
		return 2*getSalario_base();
	}	

}
