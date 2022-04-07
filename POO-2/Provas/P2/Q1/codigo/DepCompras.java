package codigo;

import java.util.ArrayList;
import java.util.List;


/*Invoker*/
public class DepCompras {
	
	private List<Reposicao> pedidos = new ArrayList<Reposicao>();
	
	public void guardaPedido(Reposicao rep) {
		this.pedidos.add(rep);
		rep.execute();
	}

}
