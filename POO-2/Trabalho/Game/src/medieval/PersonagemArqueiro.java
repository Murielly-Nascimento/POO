package medieval;
import main.*;

public class PersonagemArqueiro extends PersonagemMedieval {
	
    //CONSTRUTOR
    public PersonagemArqueiro(int X, int Y)
    {
    	super(X,Y);
        setAtaque(new AtaqueForte());
        setPulo(new PuloMedio());
        setCorrida(new CorridaDevagar());
        setEstado(new EstadoNormal(this));
    }

}