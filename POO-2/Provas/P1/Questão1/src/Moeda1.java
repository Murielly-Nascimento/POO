
public class Moeda1 extends MaquinaVenda{

	@Override
	public void processaMoeda(double tamanho) {
		if(tamanho == 1) {
			System.out.println("Moeda processada: R$ 0,01");
		}
		else {
			if(getSucessor()!=null)
				getSucessor().processaMoeda(tamanho);
			else
				System.out.println("Moeda rejeitada");
		}
		
	}

}
