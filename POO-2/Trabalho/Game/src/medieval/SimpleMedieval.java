package medieval;


public class SimpleMedieval extends FabricaMedieval{
	
	private static SimpleMedieval instancia = new SimpleMedieval();
	
	private SimpleMedieval() {
		super();
	}
	
	public static SimpleMedieval getInstancia() {
		return instancia;
	}
	
	public PersonagemMedieval criaPersonagem() {
		double tipo = Math.random();
		
		PersonagemMedieval p = null;
		
		if(tipo <= 0.3) {
			p = new PersonagemArqueiro(0,0);
		}
		else if(tipo > 0.3 && tipo <= 0.6) {
			p = new PersonagemFeiticeira(0,0);
		}
		else if(tipo>0.6 && tipo<=1.0) {
			p = new PersonagemTemplario(0,0);
		}
		return p;
		
	}
	
	public ObservadorMedieval criaInimigos() {
		double tipo = Math.random();
		
		ObservadorMedieval o = null;
		
		if(tipo <= 0.3) {
			o = new ObservadorBarbaro(0,0);
		}
		else if(tipo>0.3 && tipo <= 0.6) {
			o = new ObservadorLadino(0,0);
		}
		else if(tipo>0.6 && tipo<=1.0) {
			o = new ObservadorRanger(0,0);
		}
		
		return o;
	}

}