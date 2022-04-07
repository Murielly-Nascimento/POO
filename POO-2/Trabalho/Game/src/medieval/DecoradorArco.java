package medieval;
import main.Ataque;


public class DecoradorArco extends DecoradorMedieval{
	
	//CONSTRUTOR
	public DecoradorArco(Ataque poder) {
		super(poder);
		setAtaque(60);
		setDescricao("Usa flechas de gelo");
	}

}