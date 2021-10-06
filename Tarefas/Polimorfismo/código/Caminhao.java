package código;

public class Caminhao extends Veículo {
	private int eixos;
	
	public Caminhao(String placa, int ano, int eixos) {
		super(placa,ano);
		setEixos(eixos);
		
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		if(eixos >= 0) this.eixos = eixos;
	}
	
	public void exibirDados() {
		System.out.println("Placa: " + getPlaca());
		System.out.println("Ano: " + getAno());
		System.out.println("Eixos: " + getEixos());
	}
}
