package código;

public class TestaVeículo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("XYZ-47",2010, 3);
		Onibus o = new Onibus("XYZ-48", 2020, 10);
		Veículo v = new Veículo();
		v.setAno(2000);
		v.setPlaca("XYZ-49");
		
		Veículo[] veiculo = new Veículo[3];
		veiculo[0] = v;
		veiculo[1] = c;
		veiculo[2] = o;
		
		for(int i = 0; i < veiculo.length; i++) 
			veiculo[i].exibirDados();	
		
	}

}
