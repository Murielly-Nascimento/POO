
public class Aluno {
	public String CPF;
	public String nome;
	public int matrícula;
	
	public void cadastrar(Aluno aluno) {
		CPF = aluno.CPF;
		nome = aluno.nome;
		matrícula = aluno.matrícula;
	}
}
