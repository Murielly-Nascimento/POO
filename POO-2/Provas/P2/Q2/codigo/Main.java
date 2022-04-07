package codigo;

public class Main {

	public static void main(String[] args) {
		
		FabricaObjetos f = new Fabrica2D();
		f.cria2D();
		f.cria3D();
		
		System.out.println();
		FabricaObjetos f2 =  new Fabrica3D();
		f2.cria2D();
		f2.cria3D();

	}

}
