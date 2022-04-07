package medieval;
import main.Ataque;


public abstract class DecoradorMedieval extends Ataque{
	
	//ATRIBUTOS
	private Ataque ataqueMedieval;
	
	//CONSTRUTOR
	public DecoradorMedieval(Ataque ataqueMedieval) {
		this.ataqueMedieval = ataqueMedieval;
	}
	
	//MÉTODOS
	public int getAtaque() {
		return ataqueMedieval.getAtaque() + super.getAtaque();
	}

	public String getDescricao() {
		return ataqueMedieval.getDescricao() + "\n" + super.getDescricao();
	}

}