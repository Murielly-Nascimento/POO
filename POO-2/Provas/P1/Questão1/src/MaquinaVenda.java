
public abstract class MaquinaVenda {
	
	private MaquinaVenda sucessor;

	public MaquinaVenda getSucessor() {
		return sucessor;
	}

	public void setSucessor(MaquinaVenda sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract void processaMoeda(double tamanho);

}
