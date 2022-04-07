package codigo;

public abstract class Objeto {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void criarObjeto() {
		System.out.println(getDescricao());
	}

}
