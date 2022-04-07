
public abstract class Decorador extends Forma{

	private Forma formaDecorada;
	
	public Decorador(Forma formaDecorada) {
		this.formaDecorada = formaDecorada;
	}
	
	public String getDescricao() {
		return formaDecorada.getDescricao() + "," + super.getDescricao();
	}	
		
}
