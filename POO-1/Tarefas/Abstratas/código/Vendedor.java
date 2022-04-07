package código;

public class Vendedor extends Funcionario{
	
	private double comissao;
	
	public Vendedor(String nome, String matricula, double salario_base, double comissao) {
		super(nome, matricula, salario_base);
		setComissao(comissao);
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	double calculaSalario() {
		return getComissao() + getSalario_base();
	}

}
