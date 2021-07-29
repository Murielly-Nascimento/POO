
public class Disciplina {
	public String código;
	public String nome;
	public int cargaHorária;
	
	public void cadastrar(Disciplina disciplina) {
		código = disciplina.código;
		cargaHorária = disciplina.cargaHorária;
	}
}
