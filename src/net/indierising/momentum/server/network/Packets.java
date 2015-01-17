package net.indierising.momentum.server.network;

import net.indierising.momentum.server.entitydata.PlayerData;

public class Packets {
	public static class ConstantsPacket {
		public int TILE_SIZE;
		public int MAX_MAPS;
		public int MAX_MAP_NPCS;
	}
	
	public static class Key {
		public int key;
		public boolean pressed;// whether the key was pressed or released.
	}

	public static class PlayerPacket {
		public PlayerData data;
	}
	
	public static class PlayerMove {
		public int connectionID;
		public float x, y;
		public int dir;
	}
	
	public static class NPCPacket {
		public float x, y, speed;
		public int direction;
		public String imageLocation;
		public int id;
	}
	
	public static class ChatMessage {
		public String title,message;
	}
	
	// information about player class
	public static class PlayerClass{
		public String name,description;
		public int id,damage,health;
		// TODO add abilities
	}
}
