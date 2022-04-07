package main;


public abstract class Ataque {
	
	private int ataque;
	private String descricao;
	
	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int atacar() {
        System.out.println(getDescricao());
        return getAtaque();
	}
}