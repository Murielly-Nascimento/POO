package medieval;
import main.*;

public class ObservadorLadino extends ObservadorMedieval{
	
	public ObservadorLadino(int X, int Y) {
		super(X, Y);
        setAtaque(new AtaqueForte());
        setCorrida(new CorridaRapida());
        setPulo(new PuloAlto());
	}

}