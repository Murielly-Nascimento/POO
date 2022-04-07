package main;


public class EstadoPerigo extends Estado{
	
	//CONSTRUTOR
	public EstadoPerigo(NPC p) {
		super(p);
	}

	//MÉTODOS	
	@Override
	protected void setAtaque() {
		this.getNpc().setAtaque(new AtaqueFraco());
	}

	@Override
	protected void setPulo() {
		this.getNpc().setCorrida(new CorridaDevagar());
	}

	@Override
	protected void setCorrida() {
		this.getNpc().setPulo(new PuloBaixo());
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(30);
	}
	
	@Override
	protected void verificarAlteraEstado() {
		int energia = super.getNpc().getLife();
		
		if(energia <= this.getLimiteInferior())
			this.getNpc().setEstado(new EstadoMorto(this.getNpc()));
		
		else if(energia > this.getLimiteSuperior())
			this.getNpc().setEstado(new EstadoNormal(this.getNpc()));
		
	}

}