package net.indierising.momentum.server.entitydata;

import net.indierising.momentum.server.entities.NPC;

public class NPCData {
	public int id;
	public String name;
	public float x, y, speed;
	public int dir;
	public float width, height;
	public String imageLoc;
	public float health, damage;
	
	public NPCData() {}
	
	public NPCData(NPC npc) {
		this.id = npc.getID();
		this.name = npc.getName();
		this.x = npc.getX();
		this.y = npc.getY();
		this.dir = npc.getDir();
		this.width = npc.getWidth();
		this.height = npc.getHeight();
		this.imageLoc = npc.getImageLoc();
		this.health = npc.getHealth();
		this.damage = npc.getDamage();
	}
	
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", pos: " + x + ", " + y;
	}
}
