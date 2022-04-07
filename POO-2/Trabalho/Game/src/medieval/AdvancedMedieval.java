package medieval;
import main.*;


public class AdvancedMedieval extends FabricaMedieval {
	
	private static AdvancedMedieval instancia = new AdvancedMedieval();
	
	private AdvancedMedieval() {
		super();
	}
	
	public static AdvancedMedieval getInstancia() {
		return instancia;
	}
	
	public PersonagemMedieval criaPersonagem() {
		double tipo = Math.random();
		
		PersonagemMedieval p = null;
		
		if(tipo <= 0.3) {
			p = new PersonagemArqueiro(0,0);
			
			Ataque ataque = p.getAtaque();
			ataque = new DecoradorArco(ataque);
			p.setAtaque(ataque);
			
		}
		else if(tipo > 0.3 && tipo <= 0.6) {
			p = new PersonagemFeiticeira(0,0);
			
			Ataque ataque = p.getAtaque();
			ataque = new DecoradorMagia(ataque);
			p.setAtaque(ataque);
			
		}
		else if(tipo>0.6 && tipo<=1.0) {
			p = new PersonagemTemplario(0,0);
			
			Ataque ataque = p.getAtaque();
			ataque = new DecoradorEspada(ataque);
			p.setAtaque(ataque);
			
		}
		return p;
		
	}
	
	public ObservadorMedieval criaInimigos() {
		double tipo = Math.random();
		
		ObservadorMedieval o = null;
		
		if(tipo <= 0.3) {
			o = new ObservadorBarbaro(0,0);
			
			Ataque ataque = o.getAtaque();
			ataque = new DecoradorEspada(ataque);
			o.setAtaque(ataque);
		}
		else if(tipo > 0.3 && tipo <= 0.6) {
			o = new ObservadorLadino(0,0);
			
			Ataque ataque = o.getAtaque();
			ataque = new DecoradorArco(ataque);
			o.setAtaque(ataque);
		}
		else if(tipo>0.6 && tipo<=1.0) {
			o = new ObservadorRanger(0,0);
			
			Ataque ataque = o.getAtaque();
			ataque = new DecoradorMagia(ataque);
			o.setAtaque(ataque);
		}
		
		return o;
	}

}