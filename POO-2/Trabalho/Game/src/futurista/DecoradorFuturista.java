package futurista;
import main.Ataque;

public abstract class DecoradorFuturista extends Ataque{
	
	//ATRIBUTOS
	private Ataque ataqueFuturista;
	
	//CONSTRUTOR
	public DecoradorFuturista(Ataque ataqueFuturista) {
		this.ataqueFuturista = ataqueFuturista;
	}
	
	//MÉTODOS
	public int getAtaque() {
		return ataqueFuturista.getAtaque() + super.getAtaque();
	}

	public String getDescricao() {
		return ataqueFuturista.getDescricao() + "\n" + super.getDescricao();
	}


}