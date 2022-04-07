package medieval;

import Visao.*;

public class CompositeMedieval implements ComponenteMedieval{
	
	private ComponenteMedieval caminho1;
	private ComponenteMedieval caminho2;
	private int inimigos;
	private String descricao;
	
	
	public CompositeMedieval(int inimigos, String descricao, ComponenteMedieval caminho1, ComponenteMedieval caminho2) {
		this.caminho1 = caminho1;
		this.caminho2 = caminho2;
		this.inimigos = inimigos;
		this.descricao = descricao;
	}
	
	
	public ComponenteMedieval getCaminho1() {
		return caminho1;
	}



	public void setCaminho1(ComponenteMedieval caminho1) {
		this.caminho1 = caminho1;
	}



	public ComponenteMedieval getCaminho2() {
		return caminho2;
	}



	public void setCaminho2(ComponenteMedieval caminho2) {
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



	public void jogoMedieval(PersonagemMedieval p) {
		
		System.out.println("Personagem" + p.getClass().getName()+" entrou na fase "+ this.descricao);
		
		try {
			
			if(this.inimigos <= 1) {
				MedievalFacil g1 =  new MedievalFacil();
				g1.jogar(g1, p);
			}else if(this.inimigos >= 2){
				MedievalMedio g1 =  new MedievalMedio();
				g1.jogar(g1, p);
			}else {
				MedievalDificil g1 =  new MedievalDificil();
				g1.jogar(g1, p);
			}
			
			Thread.sleep(3000);
			
		
			double valor = Math.random();
			
			if(valor < 0.5) {
				System.out.println("Personagem " + p.getClass().getName()+ " pegou caminho 1");
				caminho1.jogoMedieval(p);
			}
			else{
				
				System.out.println("Personagem " + p.getClass().getName()+ " pegou caminho 2");
				caminho2.jogoMedieval(p);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
}
