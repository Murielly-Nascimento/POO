package futurista;
import main.*;

public class PersonagemPolicial extends PersonagemFuturista{
	
	//CONSTRUTOR
    public PersonagemPolicial(int X, int Y)
    {
    	super(X,Y);
        setPulo(new PuloAlto());
        setCorrida(new CorridaRapida());
        setAtaque(new AtaqueMedio());
        setEstado(new EstadoNormal(this));
    }	
}