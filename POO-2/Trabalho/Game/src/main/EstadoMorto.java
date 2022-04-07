package main;


public class EstadoMorto extends Estado{
	
	//CONSTRUTOR
	public EstadoMorto(NPC npc) {
		super(npc);
	}

	//MÉTODOS	
	@Override
	protected void setAtaque() {
	}

	@Override
	protected void setPulo() {
	}

	@Override
	protected void setCorrida() {
	}
	
	public void ganhoEnergia(int valor) {
		System.out.println("Estado Morto!");
	}

	public void perdaEnergia(int valor) {
		System.out.println("Estado Morto!");
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(0);
	}
	@Override
	protected void verificarAlteraEstado() {

	}
}