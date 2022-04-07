package codigo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Programa> p2 = new ArrayList<Programa>();
		p2.add(new ComandoCondicional(new ComandoSimples("Verdadeiro"), new ComandoSimples("Escreva Avião")));
		p2.add(new ComandoSimples("Escreva: Escola"));
		
		Programa p = new ComandoComposto(p2);
		System.out.println(p.execute());
		
	}

}
