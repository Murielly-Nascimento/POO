package futurista;
import main.*;

import java.util.Observable;
import java.util.Observer;

public abstract class ObservadorFuturista extends NPC implements Observer{
	
	//CONSTRUTOR
	public ObservadorFuturista(int X, int Y) {
		super(X,Y);
		setLife(100);
	}
	
	//METODOS
	public void setPos(int X, int Y) {
	    super.setX(X);
	    super.setY(Y);     
	}
	
	public void update(Observable subject, Object arg) {
		
		PersonagemFuturista p = (PersonagemFuturista)subject;
		
	    //Se estiver em distância de ataque
	    if ( ( (super.getX() - p.getX()) == 0) && ( (super.getY() - p.getY()) == 0) )
	    {	
	        System.out.println("Jogador: "+ this +" ataca personagem..." );  
	        
	        if(p.getCampo().getDefesa() == 0) {
	        	p.perdaEnergia(super.getAtaque().atacar());
	            super.perdaEnergia(p.atacar());
	        }else {
	        	p.getCampo().processaCampo(super.getAtaque().atacar());
	        	super.perdaEnergia(p.atacar());
	        }
	        
	        
	        if(super.getLife() <= 0) p.deleteObserver(this);
	        else {
	            
	        	if (Math.random() < 0.5){
	                p.setPos(p.getX() + 5, p.getY() - 5);
	            }
	            else {
	                p.setPos(p.getX()- 5, p.getY() + 5);
	            }
	        }
	        
	    }
	    
	    //Se precisar andar em direcao ao personagem
	    else 
	    {	
	       //Se precisa andar para frente 
	       if (p.getX() > super.getX()) super.setX(super.getX() + 1);
	       else super.setX(super.getX() - 1);
	       
	       //Se precisa andar para tras
	       if (p.getY() > super.getY()) super.setY(super.getY() + 1);
	       else super.setY(super.getY() - 1);
	    }  
	}

}