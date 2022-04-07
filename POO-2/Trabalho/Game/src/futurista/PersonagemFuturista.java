package futurista;
import main.NPC;


public abstract class PersonagemFuturista extends NPC{
	
	private Campo campo;
	
	//CONSTRUTOR
    public PersonagemFuturista(int X, int Y){
    	super(X,Y);
    	setLife(70);
    	setCampo(new CampoEletrico());
    	
    }
    
    //Getters and Setters
    public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
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