package código;

public class Tempo {
	private int hora, minuto, segundo;
	
	public Tempo(int H, int M, int S) {
		if(S > 59 || S < 0) segundo = 0;
		else segundo = S;
		
		if(M > 59 || M < 0) minuto = 0;
		else minuto = M;
		
		if(H > 23 || H < 0) hora = 0;
		else hora = H;
	}
	
	public Tempo(int H, int M) {
		segundo = 0;
		
		if(M > 59 || M < 0) minuto = 0;
		else minuto = M;
		
		if(H > 23 || H < 0) hora = 0;
		else hora = H;
	}
	
	public Tempo(int H) {
		segundo = 0;
		
		minuto = 0;
		
		if(H > 23 || H < 0) hora = 0;
		else hora = H;
	}
	
	public Tempo(Tempo tempo) {
		segundo = tempo.getSegundo();
		
		minuto = tempo.getMinuto();
		
		hora = tempo.getHora();
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public String imprimeTempo() {
		String mensagem = String.format("%d:%d:%d", hora,minuto,segundo);
		return mensagem;
	}
	
	public void incrementaMinuto() {
		if(minuto + 1 == 59) {
			minuto = 0;
			hora += 1;
		}
		else minuto++;
	}
	
	public void decrementaMinuto() {
		if(minuto - 1 < 0) {
			minuto = 59;
			hora -= 1;
		}
		else minuto--;
	}
	
}
