package futurista;
import main.*;

public class ObservadorRobo extends ObservadorFuturista{
	
	public ObservadorRobo(int X, int Y) {
		super(X, Y);
        setAtaque(new AtaqueForte());
        setCorrida(new CorridaRapida());
        setPulo(new PuloAlto());
	}
}