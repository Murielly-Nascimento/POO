
public class Moeda1_2 extends MaquinaVenda{

	@Override
	public void processaMoeda(double tamanho) {
		if(tamanho == 1.2) {
			System.out.println("Moeda processada: R$ 0,05");
		}
		else {
			if(getSucessor()!=null)
				getSucessor().processaMoeda(tamanho);
			else
				System.out.println("Moeda rejeitada");
		}
		
	}
	

}
