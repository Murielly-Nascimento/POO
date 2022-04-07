
public class EstadoDisponivel extends Estado{

	public EstadoDisponivel(Produto produto) {
		super(produto);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setLimites() {
		 this.setLimiteInferior(11);
	}
	
	public void vender(int quantidade) {
		super.getProduto().setQuantidade(super.getProduto().getQuantidade() - quantidade);
		this.verificarAlteracaoEstado();
		System.out.println("Alerta!");
		System.out.println("Estoque em Estado Crítico. Reponha antes que acabe");
		
	}

	@Override
	protected void verificarAlteracaoEstado() {
		if(this.getProduto().getQuantidade() <= 0)
			this.getProduto().setEstado(new EstadoIndisponivel(this.getProduto()));
		else if(this.getProduto().getQuantidade() < this.getLimiteInferior())
			this.getProduto().setEstado(new EstadoCritico(this.getProduto()));
		
	}
	

}
