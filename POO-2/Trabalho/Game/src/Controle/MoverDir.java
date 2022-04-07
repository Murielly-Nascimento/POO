package Controle;

import main.NPC;

public class MoverDir implements Command{
	private NPC npc;
	
	public MoverDir(NPC npc) {
		this.npc = npc;
	}
	
	public void execute() {
		npc.moverDir();
	}
}
