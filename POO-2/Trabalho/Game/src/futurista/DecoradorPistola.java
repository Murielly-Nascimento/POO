package futurista;
import main.Ataque;


public class DecoradorPistola extends DecoradorFuturista{
	
	//CONSTRUTOR
	public DecoradorPistola(Ataque poder) {
		super(poder);
		setAtaque(50);
		setDescricao("Usa pistola Silver Taurus");
	}

}