package futurista;
import main.*;


public class AdvancedFuturista extends FabricaFuturista{
	
	private static AdvancedFuturista instancia = new AdvancedFuturista();
	
	private AdvancedFuturista() {
		super();
	}
	
	public static AdvancedFuturista getInstancia() {
		return instancia;
	}
	
	public PersonagemFuturista criaPersonagem() {
		double tipo = Math.random();
		
		PersonagemFuturista p = null;
		
		if(tipo <= 0.3) {
			p = new PersonagemPolicial(0,0);
			
			Ataque ataque = p.getAtaque();
			ataque = new DecoradorSabre(ataque);
			p.setAtaque(ataque);
			
		}
		else if(tipo > 0.3 && tipo <= 0.6) {
			p = new PersonagemDiplomata(0,0);
			
			Ataque ataque = p.getAtaque();
			ataque = new DecoradorPistola(ataque);
			p.setAtaque(ataque);
			
		}
		else if(tipo>0.6 && tipo<=1.0) {
			p = new PersonagemCientista(0,0);
			
			Ataque ataque = p.getAtaque();
			ataque = new DecoradorRaio(ataque);
			p.setAtaque(ataque);
			
		}
		return p;
		
	}
	
	public ObservadorFuturista criaInimigos() {
		double tipo = Math.random();
		
		ObservadorFuturista o = null;
		
		if(tipo <= 0.3) {
			o = new ObservadorRobo(0,0);
			
			Ataque ataque = o.getAtaque();
			ataque = new DecoradorSabre(ataque);
			o.setAtaque(ataque);
		}
		else if(tipo > 0.3 && tipo <= 0.6) {
			o = new ObservadorPiloto(0,0);
			
			Ataque ataque = o.getAtaque();
			ataque = new DecoradorPistola(ataque);
			o.setAtaque(ataque);
		}
		else if(tipo>0.6 && tipo<=1.0) {
			o = new ObservadorSoldado(0,0);
			
			Ataque ataque = o.getAtaque();
			ataque = new DecoradorRaio(ataque);
			o.setAtaque(ataque);
		}
		
		return o;
	}

}
