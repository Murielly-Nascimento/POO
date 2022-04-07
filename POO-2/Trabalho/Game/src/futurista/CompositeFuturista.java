package futurista;
import Visao.*;

import java.util.ArrayList;

public class CompositeFuturista implements ComponenteFuturista{
	
	private ComponenteFuturista caminho1;
	private ComponenteFuturista caminho2;
	private int inimigos;
	private String descricao;
	
	
	public CompositeFuturista(int inimigos, String descricao, ComponenteFuturista caminho1, ComponenteFuturista caminho2) {
		this.caminho1 = caminho1;
		this.caminho2 = caminho2;
		this.inimigos = inimigos;
		this.descricao = descricao;
	}
	
	
	public ComponenteFuturista getCaminho1() {
		return caminho1;
	}



	public void setCaminho1(ComponenteFuturista caminho1) {
		this.caminho1 = caminho1;
	}



	public ComponenteFuturista getCaminho2() {
		return caminho2;
	}



	public void setCaminho2(ComponenteFuturista caminho2) {
		this.caminho2 = caminho2;
	}



	public int getInimigos() {
		return inimigos;
	}



	public void setInimigos(int inimigos) {
		this.inimigos = inimigos;
	}

	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public void jogoFuturista(PersonagemFuturista p) {
		
		System.out.println("Personagem" + p.getClass().getName()+" entrou na fase "+ this.descricao);
		
		try {
			
			if(this.inimigos <= 1) {
				FuturistaFacil g1 =  new FuturistaFacil();
				g1.jogar(g1, p);
			}else if(this.inimigos >= 2){
				FuturistaMedio g1 =  new FuturistaMedio();
				g1.jogar(g1, p);
			}else {
				FuturistaDificil g1 =  new FuturistaDificil();
				g1.jogar(g1, p);
			}
			
			Thread.sleep(3000);
			
		
			double valor = Math.random();
			
			if(valor < 0.5) {
				System.out.println("Personagem " + p.getClass().getName()+ " pegou caminho 1");
				caminho1.jogoFuturista(p);
			}
			else{
				
				System.out.println("Personagem " + p.getClass().getName()+ " pegou caminho 2");
				caminho2.jogoFuturista(p);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}
	
	


}