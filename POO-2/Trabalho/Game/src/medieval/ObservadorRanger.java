package medieval;
import main.*;

public class ObservadorRanger extends ObservadorMedieval{
	
	public ObservadorRanger(int X, int Y) {
		super(X, Y);
        setAtaque(new AtaqueMedio());
        setCorrida(new CorridaMedia());
        setPulo(new PuloMedio());
	}
}