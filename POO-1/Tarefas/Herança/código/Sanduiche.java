package código;

public class Sanduiche extends Prato{
	private String pão;				
	private String carne;				
	private String salada;
	
	public Sanduiche(double custo, double precoVenda, double tempoPreparo,String pão, String carne, String salada) {
		super(custo, precoVenda, tempoPreparo);
		setPão(pão);
		setCarne(carne);
		setSalada(salada);
	}
	
	public Sanduiche(Sanduiche s) {
		super(s.getCusto(),s.getPrecoVenda(),s.getTempoPreparo());
		setPão(s.getPão());
		setCarne(s.getCarne());
		setSalada(s.getSalada());
	}

	public String getPão() {
		return pão;
	}

	public void setPão(String pão) {
		this.pão = pão;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getSalada() {
		return salada;
	}

	public void setSalada(String salada) {
		this.salada = salada;
	}

	
	
	
	
	
	
	
	

}
