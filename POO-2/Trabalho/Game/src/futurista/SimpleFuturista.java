package futurista;


public class SimpleFuturista extends FabricaFuturista{
	
	private static SimpleFuturista instancia = new SimpleFuturista();
	
	private SimpleFuturista() {
		super();
	}
	
	public static SimpleFuturista getInstancia() {
		return instancia;
	}
	
	public PersonagemFuturista criaPersonagem() {
		double tipo = Math.random();
		
		PersonagemFuturista p = null;
		
		if(tipo <= 0.3) {
			p = new PersonagemPolicial(0,0);
		}
		else if(tipo>0.3 && tipo <= 0.6) {
			p = new PersonagemDiplomata(0,0);
		}
		else if(tipo>0.6 && tipo<=1.0) {
			p = new PersonagemCientista(0,0);
		}
		
		return p;
		
	}
	
	public ObservadorFuturista criaInimigos() {
		double tipo = Math.random();
		
		ObservadorFuturista o = null;
		
		if(tipo <= 0.3) {
			o = new ObservadorRobo(0,0);
		}
		else if(tipo>0.3 && tipo <= 0.6) {
			o = new ObservadorPiloto(0,0);
		}
		else if(tipo>0.6 && tipo<=1.0) {
			o = new ObservadorSoldado(0,0);
		}
		
		return o;
	}
	

}