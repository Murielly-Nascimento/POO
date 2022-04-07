package medieval;
import main.*;

public class PersonagemFeiticeira extends PersonagemMedieval{
	
    public PersonagemFeiticeira(int X, int Y)
    {
    	super(X,Y);
        setPulo(new PuloBaixo());
        setCorrida(new CorridaDevagar());
        setAtaque(new AtaqueForte());
        setEstado(new EstadoNormal(this));
    }

}