package main;


public class EstadoNormal extends Estado{
	
	//CONSTRUTOR
	public EstadoNormal(NPC p) {
		super(p);
	}
	
	//MÉTODOS
	@Override
	protected void setAtaque() {
		this.getNpc().setAtaque(new AtaqueMedio());
	}

	@Override
	protected void setPulo() {
		this.getNpc().setCorrida(new CorridaMedia());
	}

	@Override
	protected void setCorrida() {
		this.getNpc().setPulo(new PuloMedio());
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(30);
		this.setLimiteSuperior(70);
	}
	
	@Override
	protected void verificarAlteraEstado() {
		int energia = this.getNpc().getLife();
		
		if(energia < this.getLimiteInferior())
			this.getNpc().setEstado(new EstadoPerigo(this.getNpc()));
		
		else if(energia > this.getLimiteSuperior())
			this.getNpc().setEstado(new EstadoForte(this.getNpc()));
		
	}

}