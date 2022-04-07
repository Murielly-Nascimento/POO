package main;


public class EstadoForte extends Estado{

	//CONSTRUTOR
	public EstadoForte(NPC p) {
		super(p);
	}

	//MÉTODOS
	@Override
	protected void setAtaque() {
		this.getNpc().setAtaque(new AtaqueForte());
	}

	@Override
	protected void setPulo() {
		this.getNpc().setCorrida(new CorridaRapida());
	}

	@Override
	protected void setCorrida() {
		this.getNpc().setPulo(new PuloAlto());
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(70);
		this.setLimiteSuperior(100);
	}
	
	@Override
	protected void verificarAlteraEstado() {
		int energia = this.getNpc().getLife();
		
		if(energia < this.getLimiteInferior())
			this.getNpc().setEstado(new EstadoNormal(this.getNpc()));
		
		else if(energia <= 0)
			this.getNpc().setEstado(new EstadoMorto(this.getNpc()));
	}
	
	
}