package futurista;

public class GameFuturista implements Runnable{
	
	private ComponenteFuturista jogo;
	private PersonagemFuturista p;
	
	public GameFuturista(ComponenteFuturista jogo, PersonagemFuturista p) {
		this.jogo = jogo;
		this.p = p;
	}
	
	public void run() {
		jogo.jogoFuturista(p);
	}

}
