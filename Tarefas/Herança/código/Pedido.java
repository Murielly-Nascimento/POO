package código;

import java.util.ArrayList;

public class Pedido {
	private String cpf;				
	private String data;			
	private double taxa;			// A taxa dos serviços
	private double totalPratos;		// O valor total dos pratos
	private double total;			// O valor total do pedido
	
	private ArrayList<Prato> prato = new ArrayList<Prato>();
	
	public Pedido(String cpf, String data) {
		setCpf(cpf);
		setData(data);
	}
	
	/*Os atributos relacionados ao valor do pedido obedecem a certas regras de negócio
	 * Portanto, não passamos eles como parâmetros dos construtores
	 * Ao invés disso chamamos os métodos que os calculam*/
	
	public Pedido(String cpf, String data, ArrayList<Prato> pratos) {
		setCpf(cpf);
		setData(data);
		setPrato(prato);
		
		calculaTotalPratos();
		calculaTaxa();
		calculaPedido();
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		if(taxa >=0 )this.taxa = taxa;
		else taxa = 0;
	}
	public double getTotalPratos() {
		return totalPratos;
	}
	public void setTotalPratos(double totalPratos) {
		if(totalPratos >= 0 ) this.totalPratos = totalPratos;
		else totalPratos = 0;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		if(total >=0 )this.total = total;
		else total = 0;
	}
	public ArrayList<Prato> getPrato() {
		return prato;
	}
	public void setPrato(ArrayList<Prato> prato) {
		this.prato = prato;
	}
	public void adicionaPrato(Prato p) {
			prato.add(p);
		
	}
	
	public double calculaTotalPratos() {
		double valor = 0;
		
		for(int i = 0; i< prato.size(); i++) 
			valor += prato.get(i).calculaPreco();
		
		setTotalPratos(valor);
		return valor;
	}
	
	public double calculaTaxa() {
		double valor = calculaTotalPratos();
		valor = valor * 0.1;
		setTaxa(valor);
		return valor;
	}
	
	public double calculaPedido() {
		double valor = calculaTotalPratos();
		double taxa = calculaTaxa();
		
		double soma = valor + taxa;
		setTotal(soma);
		return soma;
	}
}
