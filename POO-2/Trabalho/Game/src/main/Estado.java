package main;


public abstract class Estado {
	
	//ATRIBUTOS
	private NPC npc;
	private int limiteInferior;
	private int limiteSuperior;
	
	//CONSTRUTOR
	
	public Estado(NPC npc) {
		setNpc(npc);
		
		setAtaque();
		setPulo();
		setCorrida();
		
		setLimites();
	}
	
	//GETTERS AND SETTERS
	public NPC getNpc() {
		return npc;
	}

	public void setNpc(NPC npc) {
		this.npc = npc;
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
	
	protected abstract void setAtaque();
	protected abstract void setPulo();
	protected abstract void setCorrida();
	protected abstract void setLimites();
	
	//MÉTODOS
	public void ganhoEnergia(int valor) {
		if(this.npc.getLife() > 0)
			this.npc.setLife(this.getNpc().getLife() + valor);
		this.verificarAlteraEstado();
	}
	
	public void perdaEnergia(int valor) {
		if(this.npc.getLife() > 0)
			this.npc.setLife(this.getNpc().getLife() - valor);
		this.verificarAlteraEstado();
	}
	
	protected abstract void verificarAlteraEstado();

}