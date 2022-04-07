
public class Moeda1_4 extends MaquinaVenda{

	@Override
	public void processaMoeda(double tamanho) {
		if(tamanho == 1.4) {
			System.out.println("Moeda processada: R$ 0,10");
		}
		else {
			if(getSucessor()!=null)
				getSucessor().processaMoeda(tamanho);
			else
				System.out.println("Moeda rejeitada");
		}
		
	}

}
