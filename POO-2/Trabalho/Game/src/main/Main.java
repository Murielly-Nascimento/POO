package main;
import Controle.*;
import Visao.*;
import medieval.*;
import futurista.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		PersonagemMedieval p1 = new PersonagemTemplario(0,0);
		//CompositeMedieval c1 = new CompositeMedieval(1, "Fase 1",new CompositeMedieval(2, "Fase 2", new Folha(), new Folha()), new Folha());
		//Thread t1 = new Thread(new GameMedieval(c1,p1));
		//t1.run();
		
		PersonagemFuturista p2 = new PersonagemPolicial(0,0);
		//CompositeFuturista c2 = new CompositeFuturista(1, "Fase 1", new CompositeFuturista(2, "Fase 2", new FolhaFim(), new FolhaFim()), new FolhaFim());
		//Thread t2 = new Thread(new GameFuturista(c2,p2));
		//t2.run();
		
		//FuturistaFacil f = new FuturistaFacil();
		//f.jogar(f, p2);
		
		//FuturistaMedio f2 = new FuturistaMedio();
		//f2.jogar(f2, p2);
		
		//FuturistaDificil f3 = new FuturistaDificil();
		//f3.jogar(f3, p2);
		
		//MedievalFacil m = new MedievalFacil();
		//m.jogar(m, p1);
		
		//MedievalMedio m2 = new MedievalMedio();
		//m2.jogar(m2, p1);
		
		MedievalDificil m3 = new MedievalDificil();
		m3.jogar(m3, p1);
		
		System.out.println("fim");

	}

}
