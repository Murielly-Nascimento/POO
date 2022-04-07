package código;

public class Onibus extends Veículo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa,ano);
		setAssentos(assentos);
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		if(assentos >= 0) this.assentos = assentos;
	}
	
	public void exibirDados() {
		System.out.println("Placa: " + getPlaca());
		System.out.println("Ano: " + getAno());
		System.out.println("Assentos: " + getAssentos());
	}
	

}
