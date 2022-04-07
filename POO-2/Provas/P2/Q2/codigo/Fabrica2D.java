package codigo;

public class Fabrica2D extends FabricaObjetos{
	
	
	public Copo fabricaCopo() {
		Copo c = new Copo();
		return c;
	}
	
	public Prato fabricaPrato() {
		Prato p = new Prato();
		return p;
	}
	
	public Garrafa fabricaGarrafa() {
		Garrafa g = new Garrafa();
		return g;
	}
	
	public void cria2D() {
		Copo c = fabricaCopo();
		c.criarObjeto();
		
		Prato p = fabricaPrato();
		p.criarObjeto();
		
		Garrafa g = fabricaGarrafa();
		g.criarObjeto();
	}
	public void cria3D() {
		
	}
	
	

}
