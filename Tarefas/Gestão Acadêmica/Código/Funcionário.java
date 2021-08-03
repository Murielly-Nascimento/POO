
public class Funcionário {
	public String nome;
	public String endereço;
	public int telefone;
	public String CPF;
	public int CTPS;
	public float salário;
	
	public void cadastrar(Funcionário funcionário) {
		nome = funcionário.nome;
		endereço = funcionário.endereço;
		telefone = funcionário.telefone;
		CPF = funcionário.CPF;
		CTPS = funcionário.CTPS;
		salário = funcionário.salário;
		
	}
}
