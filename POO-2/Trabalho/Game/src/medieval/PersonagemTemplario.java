package medieval;
import main.*;

public class PersonagemTemplario extends PersonagemMedieval{
	
	//CONSTRUTOR
    public PersonagemTemplario(int X, int Y)
    {
    	super(X,Y);
        setPulo(new PuloAlto());
        setCorrida(new CorridaRapida());
        setAtaque(new AtaqueMedio());
        setEstado(new EstadoNormal(this));
    }	

}