
public class Professor {
	public String titulação;
	public String áreaPesquisa;
	
	public void cadastrar(Professor professor) {
		titulação = professor.titulação;
		áreaPesquisa = professor.áreaPesquisa;
	}
}
