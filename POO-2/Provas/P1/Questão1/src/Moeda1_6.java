
public class Moeda1_6 extends MaquinaVenda{

	@Override
	public void processaMoeda(double tamanho) {
		if(tamanho == 1.6) {
			System.out.println("Moeda processada: R$ 0.50");
		}
		else {
			if(getSucessor()!=null)
				getSucessor().processaMoeda(tamanho);
			else
				System.out.println("Moeda rejeitada");
		}
		
	}

}
