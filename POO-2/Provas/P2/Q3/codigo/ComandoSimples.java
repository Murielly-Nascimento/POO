package codigo;

public class ComandoSimples implements Programa{
	
	private String comando;
	
	public ComandoSimples(String comando) {
		this.comando = comando;
	}
	
	public String execute() {
		return this.comando;
	}

}
