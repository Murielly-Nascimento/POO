package código;

public class Item {
	private double quantidade;
	private Produto produto;
	
	public Item(double quantidade, Produto p) {
		setQuantidade(quantidade);
		setProduto(p);
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		if(quantidade <= this.produto.getQuantidade()) this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
