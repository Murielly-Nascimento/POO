
public abstract class Forma {
	
	private String descricao;
	private int lados;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public void desenhar() {
		System.out.println(getDescricao());
	}
	
}
