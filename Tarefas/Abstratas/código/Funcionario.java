package código;

public abstract class Funcionario implements Imprimivel{
	
	private String nome;
	private String matricula;
	private double salario_base;
	
	public Funcionario(String nome, String matricula, double salario_base) {
		setNome(nome);
		setMatricula(matricula);
		setSalario_base(salario_base);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}

	double calculaSalario() {
		return salario_base;
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Salário R$ " + calculaSalario());
		System.out.println();
	}

}
