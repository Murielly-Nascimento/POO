package Controle;

import main.NPC;

public class MoverBaixo implements Command{
	
	private NPC npc;
	
	public MoverBaixo(NPC npc) {
		this.npc = npc;
	}
	
	public void execute() {
		npc.moverBaixo();
	}

}
