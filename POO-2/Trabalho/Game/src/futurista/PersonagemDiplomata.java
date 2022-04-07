package futurista;
import main.*;

public class PersonagemDiplomata extends PersonagemFuturista{
	
    public PersonagemDiplomata(int X, int Y)
    {
    	super(X,Y);
        setPulo(new PuloBaixo());
        setCorrida(new CorridaDevagar());
        setAtaque(new AtaqueForte());
        setEstado(new EstadoNormal(this));
    }

}