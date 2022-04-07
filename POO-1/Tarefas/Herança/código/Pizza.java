package código;

public class Pizza extends Prato{
	private String molho;			
	private String recheio;		
	private String borda;
	
	public Pizza (double custo, double precoVenda, double tempoPreparo, String molho, String recheio, String borda) {
		super(custo, precoVenda, tempoPreparo);
		setMolho(molho);
		setRecheio(recheio);
		setBorda(borda);
	}
	
	public Pizza (Pizza p) {
		super(p.getCusto(),p.getPrecoVenda(),p.getTempoPreparo());
		setMolho(p.getMolho());
		setRecheio(p.getRecheio());
		setBorda(p.getBorda());
	}
	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}
	

	
	
	
	
	
	
}
