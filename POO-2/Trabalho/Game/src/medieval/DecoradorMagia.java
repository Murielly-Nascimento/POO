package medieval;
import main.Ataque;


public class DecoradorMagia extends DecoradorMedieval{
	
	//CONSTRUTOR
	public DecoradorMagia(Ataque poder) {
		super(poder);
		setAtaque(50);
		setDescricao("Usa elementos agua, fogo e terra");
	}

}