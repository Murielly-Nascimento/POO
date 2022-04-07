package codigo;

import java.util.ArrayList;

public class ComandoComposto implements Programa{
	
	private ArrayList<Programa> comando = new ArrayList<Programa>();
	
	public ComandoComposto(ArrayList<Programa> comandos) {
		for(int i = 0; i<comandos.size(); i++) {
			this.comando.add(comandos.get(i));
		}
	}
	
	public String execute() {
		
		String conteudo = new String(); 
		
		for(int i = 0; i<this.comando.size(); i++) {
			conteudo += this.comando.get(i).execute();
			conteudo +="\n";
		}

		return conteudo;
	}
	
	
	
	

}
