package futurista;
import main.*;

public abstract class FabricaFuturista extends Fabrica{
	
	public abstract PersonagemFuturista criaPersonagem();
	public abstract ObservadorFuturista criaInimigos();
	
	public void jogoMedieval() {

	}

	@Override
	public void jogoFuturista() {
		
		System.out.println();
		PersonagemFuturista p = criaPersonagem();
		System.out.println(p.getClass().getName());
		
		p.atacar();
		p.correr();
		p.pular();
		
		System.out.println();
		ObservadorFuturista o1 = criaInimigos();
		System.out.println(o1.getClass().getName());
		o1.atacar();
		o1.correr();
		o1.pular();
		
		System.out.println();
		ObservadorFuturista o2 = criaInimigos();
		System.out.println(o2.getClass().getName());
		o2.atacar();
		o2.correr();
		o2.pular();
		
		System.out.println();
		ObservadorFuturista o3 = criaInimigos();
		System.out.println(o3.getClass().getName());
		o3.atacar();
		o3.correr();
		o3.pular();
		
	}

}