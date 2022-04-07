package medieval;
import main.*;

public abstract class FabricaMedieval extends Fabrica{
	
	public abstract PersonagemMedieval criaPersonagem();
	public abstract ObservadorMedieval criaInimigos();
	
	public void jogoMedieval() {
		
		System.out.println();
		PersonagemMedieval p = criaPersonagem();
		System.out.println(p.getClass().getName());
		
		p.atacar();
		p.correr();
		p.pular();
		
		System.out.println();
		ObservadorMedieval o1 = criaInimigos();
		System.out.println(o1.getClass().getName());
		o1.atacar();
		o1.correr();
		o1.pular();
		
		System.out.println();
		ObservadorMedieval o2 = criaInimigos();
		System.out.println(o2.getClass().getName());
		o2.atacar();
		o2.correr();
		o2.pular();
		
		System.out.println();
		ObservadorMedieval o3 = criaInimigos();
		System.out.println(o3.getClass().getName());
		o3.atacar();
		o3.correr();
		o3.pular();
	}

	@Override
	public void jogoFuturista() {
		// TODO Auto-generated method stub
		
	}

}