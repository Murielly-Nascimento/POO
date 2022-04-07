
public class main {

	public static void main(String[] args) {
		
		Forma forma = new Quadrado();
		forma = new Preenchimento(forma);
		forma = new Textura(forma);
		
		forma.desenhar();

	}

}
