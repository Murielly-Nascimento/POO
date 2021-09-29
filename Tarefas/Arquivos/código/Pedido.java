package código;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private ArrayList<Item> itens = new ArrayList<Item>();
	private String pagamento;
	
	public Pedido(ArrayList<Item> itens, String pagamento) {
		setItens(itens);
		setPagamento(pagamento);
	}
	public Pedido(String pagamento) {
		setPagamento(pagamento);
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		if(pagamento == "dinheiro" || pagamento == "cheque" || pagamento == "cartão") this.pagamento = pagamento;
	}
	
	public void adicionaItem(Item i) {
		itens.add(i);
	}
	
	
	

}
