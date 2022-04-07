package main;


public abstract class Corrida {
	
	private int corrida;
	private String descricao;
	
	
	public int getCorrida() {
		return corrida;
	}



	public void setCorrida(int corrida) {
		this.corrida = corrida;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public int correr() {
		System.out.println(getDescricao());
        return getCorrida();
	}
}