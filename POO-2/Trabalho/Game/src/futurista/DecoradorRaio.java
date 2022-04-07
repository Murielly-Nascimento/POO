package futurista;
import main.Ataque;


public class DecoradorRaio extends DecoradorFuturista{
	
	//CONSTRUTOR
	public DecoradorRaio(Ataque poder) {
		super(poder);
		setAtaque(70);
		setDescricao("Usa raio de plasma");
	}
	

}