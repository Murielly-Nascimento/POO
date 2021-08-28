package código;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(int cpf, int nro, double saldo, double limite) {
		super(cpf,nro,saldo);
		this.limite = limite;
		if(limite < 0) this.limite = 0;
	}
	
	public ContaEspecial(ContaEspecial c) {
		super(c.getCpf(), c.getNro(), c.getSaldo());
		if(c.getSaldo() < 0) this.limite = 0;
		else this.limite = c.getLimite();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void saque(double valor) {
		double saldo = getSaldo();
		if(valor <= limite) saldo -= valor;
		setSaldo(saldo);
	}
	
}
