
public class Cliente {

	public static void main(String[] args) {
		//instanciar objetos da cadeia
		MaquinaVenda moeda1 = new Moeda1();//inicio da cadeia
		MaquinaVenda moeda1_2 = new Moeda1_2();
		MaquinaVenda moeda1_4 = new Moeda1_4();
		MaquinaVenda moeda1_6 = new Moeda1_6();
		MaquinaVenda moeda1_8 = new Moeda1_8();//final da cadeia
		
		//criar cadeia – encadear os objetos da cadeia
		moeda1.setSucessor(moeda1_2);
		moeda1_2.setSucessor(moeda1_4);
		moeda1_4.setSucessor(moeda1_6);
		moeda1_6.setSucessor(moeda1_8);
		moeda1_8.setSucessor(null);
		
		//processar saques
		moeda1.processaMoeda(1);
		moeda1.processaMoeda(1.2);
		moeda1.processaMoeda(1.4);
		moeda1.processaMoeda(1.6);
		moeda1.processaMoeda(1.8);
		moeda1.processaMoeda(2);

	}

}
