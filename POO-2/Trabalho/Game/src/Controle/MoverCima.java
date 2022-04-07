package Controle;
import main.NPC;

public class MoverCima implements Command{
	
	private NPC npc;
	
	public MoverCima(NPC npc) {
		this.npc = npc;
	}
	
	public void execute() {
		npc.moverCima();
	}

}
