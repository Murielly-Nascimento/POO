package futurista;
import main.*;

public class PersonagemCientista extends PersonagemFuturista{
	
    //CONSTRUTOR
    public PersonagemCientista(int X, int Y)
    {
    	super(X,Y);
        setAtaque(new AtaqueForte());
        setPulo(new PuloMedio());
        setCorrida(new CorridaDevagar());
        setEstado(new EstadoNormal(this));
    }
	
	

}