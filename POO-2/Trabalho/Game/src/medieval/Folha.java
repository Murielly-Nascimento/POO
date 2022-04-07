package medieval;

public class Folha implements ComponenteMedieval{
	
	public void jogoMedieval(PersonagemMedieval p) {
		System.out.println("Fim de Jogo!");
		if(p.getLife() <= 0)
				System.out.println(p.getClass().getName() +" perdeu!");
		else
			System.out.println(p.getClass().getName() +" ganhou!");
		
	}

}
