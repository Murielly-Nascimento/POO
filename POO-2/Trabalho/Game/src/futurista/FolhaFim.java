package futurista;

public class FolhaFim  implements ComponenteFuturista{

	@Override
	public void jogoFuturista(PersonagemFuturista p) {
		System.out.println("Fim de Jogo!");
		if(p.getLife() <= 0)
				System.out.println(p.getClass().getName() +" perdeu!");
		else
			System.out.println(p.getClass().getName() +" ganhou!");
		
	}
	
}