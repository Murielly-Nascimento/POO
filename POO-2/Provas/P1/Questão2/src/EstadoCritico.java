
public class EstadoCritico extends Estado {

	public EstadoCritico(Produto produto) {
		super(produto);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(1);
		this.setLimiteSuperior(10);
		
	}
	

	@Override
	protected void verificarAlteracaoEstado() {
		
		if(this.getProduto().getQuantidade() < this.getLimiteInferior()) 
			this.getProduto().setEstado(new EstadoIndisponivel(this.getProduto()));
		
		else if(this.getProduto().getQuantidade() > this.getLimiteSuperior())
			this.getProduto().setEstado(new EstadoDisponivel(this.getProduto()));
		
	}

}
