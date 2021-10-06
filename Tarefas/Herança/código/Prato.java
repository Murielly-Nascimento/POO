package código;

public class Prato {
	private double custo;
	private double precoVenda;
	private double tempoPreparo;
	
	public Prato(double custo, double precoVenda, double tempoPreparo) {
		setCusto(custo);
		setPrecoVenda(precoVenda);
		setTempoPreparo(tempoPreparo);
	}
	
	public Prato(Prato p) {
		setCusto(p.getCusto());
		setPrecoVenda(p.getPrecoVenda());
		setTempoPreparo(p.getTempoPreparo());
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		if(custo >= 0) this.custo = custo;
		else this.custo = 0;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		if(precoVenda >= 0) this.precoVenda = precoVenda;
		else this.precoVenda = 0;
	}
	public double getTempoPreparo() {
		return tempoPreparo;
	}
	public void setTempoPreparo(double tempoPreparo) {
		if(tempoPreparo >= 0) this.tempoPreparo = tempoPreparo;
		else this.tempoPreparo = 0;
	}
	
	public double calculaPreco() {
		return getCusto() + getPrecoVenda();
	}
		
	
	
}
