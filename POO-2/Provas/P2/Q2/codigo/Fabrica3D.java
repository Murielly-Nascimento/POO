package codigo;

public class Fabrica3D extends FabricaObjetos{
	
	public Objeto fabricaCopo() {
		Objeto c = new Copo();
		c = new Material(c); 
		return c;
	}
	
	public Objeto fabricaPrato() {
		Objeto p = new Prato();
		p = new Material(p); 
		return p;
	}
	
	public Objeto fabricaGarrafa() {
		Objeto g = new Garrafa();
		g = new Material(g); 
		return g;
	}
	
	public void cria2D() {

	}
	public void cria3D() {
		
		Objeto c = fabricaCopo();
		c.criarObjeto();
		
		Objeto p = fabricaPrato();
		p.criarObjeto();
		
		Objeto g = fabricaGarrafa();
		g.criarObjeto();
	}

}
