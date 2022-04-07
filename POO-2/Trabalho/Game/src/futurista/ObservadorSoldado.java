package futurista;
import main.*;

public class ObservadorSoldado extends ObservadorFuturista {
	
	public ObservadorSoldado(int X, int Y) {
		super(X, Y);
        setAtaque(new AtaqueMedio());
        setCorrida(new CorridaMedia());
        setPulo(new PuloMedio());
	}

}