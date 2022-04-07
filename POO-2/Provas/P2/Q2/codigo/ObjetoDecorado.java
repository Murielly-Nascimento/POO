package codigo;

public abstract class ObjetoDecorado extends Objeto {
	
	private Objeto objetoDecorado;
	
	public ObjetoDecorado(Objeto objetoDecorado) {
		this.objetoDecorado = objetoDecorado;
	}

	public String getDescricao() {
		return objetoDecorado.getDescricao() + ", " + super.getDescricao();
	}
	
}
