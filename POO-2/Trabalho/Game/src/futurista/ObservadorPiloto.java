package futurista;
import main.*;

public class ObservadorPiloto extends ObservadorFuturista{
	
	public ObservadorPiloto(int X, int Y) {
		super(X, Y);
        setAtaque(new AtaqueFraco());
        setCorrida(new CorridaDevagar());
        setPulo(new PuloBaixo());
	}
	

}