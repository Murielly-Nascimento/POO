package medieval;
import main.*;

public class ObservadorBarbaro extends ObservadorMedieval {
	
	public ObservadorBarbaro(int X, int Y) {
		super(X, Y);
        setAtaque(new AtaqueForte());
        setCorrida(new CorridaDevagar());
        setPulo(new PuloBaixo());
	}

}