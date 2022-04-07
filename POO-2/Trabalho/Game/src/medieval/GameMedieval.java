package medieval;

public class GameMedieval implements Runnable{
	
	private ComponenteMedieval jogo;
	private PersonagemMedieval p;
	
	public GameMedieval(ComponenteMedieval jogo, PersonagemMedieval p) {
		this.jogo = jogo;
		this.p = p;
	}
	
	public void run() {
		jogo.jogoMedieval(p);
	}

}
