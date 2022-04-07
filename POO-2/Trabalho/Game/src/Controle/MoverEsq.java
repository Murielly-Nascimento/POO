package Controle;

import main.NPC;

public class MoverEsq implements Command{
	
	private NPC npc;
	
	public MoverEsq(NPC npc) {
		this.npc = npc;
	}
	
	public void execute() {
		npc.moverEsq();
	}

}