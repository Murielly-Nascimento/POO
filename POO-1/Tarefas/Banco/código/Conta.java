package código;

public class Conta {
	private int cpf;
	private int nro;
	private double saldo;
	
	public Conta(int cpf, int nro, double saldo) {
		
		this.cpf = cpf;
		this.nro = nro;
		this.saldo = saldo;
		
		if(cpf < 0)
			this.cpf = 0;
		
		if(nro < 0)
			this.nro = 0;
		
		if(saldo < 0)
			this.saldo = 0;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	
	public void saque(double valor) {
		if(valor <= saldo)
			saldo-= valor;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	

}
