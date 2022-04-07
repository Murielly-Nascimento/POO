
public abstract class Estado {
	
	private Produto produto;
	private int limiteInferior;
	private int limiteSuperior;
	
	public Estado(Produto produto) {
		setProduto(produto);
		setLimites();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	protected abstract void setLimites();
	
	public void comprar(int quantidade) {
			this.produto.setQuantidade(this.produto.getQuantidade() + quantidade);
			this.verificarAlteracaoEstado();
	}
	
	public void vender(int quantidade) {
		this.produto.setQuantidade(this.produto.getQuantidade() - quantidade);
		this.verificarAlteracaoEstado();
	}
	
	protected abstract void verificarAlteracaoEstado();

}
