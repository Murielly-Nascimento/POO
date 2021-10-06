package código;

public class Veículo {
	
	private String placa;
	private int ano;
	
	public Veículo() {
		
	}
	public Veículo(String placa, int ano) {
		setPlaca(placa);
		setAno(ano);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano >= 0) this.ano = ano;
	}
	
	public void exibirDados() {
		System.out.println("Placa: " + getPlaca());
		System.out.println("Ano: " + getAno());
	}
	

	
	
}
