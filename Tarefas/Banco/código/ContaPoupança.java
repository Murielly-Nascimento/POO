package código;

public class ContaPoupança extends Conta {
	private double taxa;
	
	public ContaPoupança(int cpf, int nro, double saldo, double taxa) {
		super(cpf, nro, saldo);
		if(taxa < 0) this.taxa = 0;
		else this.taxa = taxa;
	}
	
	public ContaPoupança(ContaPoupança c) {
		super(c.getCpf(), c.getNro(), c.getSaldo());
		if(c.getSaldo() < 0) this.taxa = 0;
		else this.taxa = c.getSaldo();
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void rendimento() {
		double valor = super.getSaldo();
		valor  += valor * taxa;
		setSaldo(valor);
	}
	
	
}
