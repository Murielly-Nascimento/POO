
public class Curso {
	public String código;
	public String nome;
	public String duração;
	
	public void cadastrar(Curso curso) {
		código = curso.código;
		nome = curso.nome;
		duração = curso.duração;
	}

}
