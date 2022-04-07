package futurista;
import main.Ataque;


public class DecoradorSabre extends DecoradorFuturista{
	
	//CONSTRUTOR
	public DecoradorSabre(Ataque poder) {
		super(poder);
		setAtaque(60);
		setDescricao("Usa sabre de luz");
	}

}