
public class EstadoIndisponivel extends Estado{

	public EstadoIndisponivel(Produto produto) {
		super(produto);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(0);
		
	}
	
	public void vender(int quantidade) {
		//Uma vez no estado indisponível não podem ser feitas vendas.
		//Já que o estoque ficaria negativo.
		System.out.println("Não é possível ter estoque negativo!");
	}

	@Override
	protected void verificarAlteracaoEstado() {
		if(this.getProduto().getQuantidade() > this.getLimiteSuperior())
			this.getProduto().setEstado(new EstadoCritico(this.getProduto()));
		
	}

}
