 package codigo;

public class ComandoCondicional implements Programa{
	
	private Programa comando1;
	private Programa comando2;
	
	public ComandoCondicional(Programa comando1, Programa comando2) {
		this.comando1 = comando1;
		this.comando2 = comando2;
	}
	
	public Programa getComando1() {
		return this.comando1;
	}
	
	public Programa getComando2() {
		return this.comando2;
	}

	public String execute() {
		
		double math = Math.random();
		if(math < 0.5) {
			return getComando1().execute() + "\n" ;
		}
		else {
			return getComando2().execute() + "\n";
		}
		
	}

}
