
public class Moeda1_8 extends MaquinaVenda{

	@Override
	public void processaMoeda(double tamanho) {
		if(tamanho == 1.8) {
			System.out.println("Moeda processada: R$ 1,00");
		}
		else {
			if(getSucessor()!=null)
				getSucessor().processaMoeda(tamanho);
			else
				System.out.println("Moeda rejeitada");
		}
		
	}

}
