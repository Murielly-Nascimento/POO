package medieval;
import main.Ataque;


public class DecoradorEspada extends DecoradorMedieval{
	
	//CONSTRUTOR
	public DecoradorEspada(Ataque poder) {
		super(poder);
		setAtaque(70);
		setDescricao("Usa espada de fogo");
	}


}