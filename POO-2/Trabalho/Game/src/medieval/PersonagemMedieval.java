package medieval;
import main.*;

public abstract class PersonagemMedieval extends NPC{
	
	private Escudo escudo;
	
	//CONSTRUTOR
    public PersonagemMedieval(int X, int Y){
    	super(X,Y);
    	setLife(70);
    	setEscudo(new EscudoFerro());
    	
    }
    
    //Getters and Setters
    public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	//MÉTODOS
    public void setPos(int X, int Y) {
        super.setX(X);
        super.setY(Y);     
        System.out.println("Posicao da Personagem: ("+super.getX()+","+super.getY()+")");
    }
    
    public void show() {
    	setChanged();
    	notifyObservers();
    }

}