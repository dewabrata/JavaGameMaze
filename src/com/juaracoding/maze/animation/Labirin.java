package com.juaracoding.maze.animation;

public class Labirin {
	
	

	private int defaultSizeRuangan = 10;
	private Player player;
	
	public Labirin(int ruangan,Player player) {
		
		if (ruangan < 10) {
			this.defaultSizeRuangan = 10;
		}else {
			this.defaultSizeRuangan= ruangan;
		}
		
		this.player =player;
		
	}
	
	public Labirin() {
		
		this.player = new Player();
		
	}
	
	
	public void draw() {
		
		Utility.clearScreen();
		
		String dummyWall = "_";
		
		for (int i = 0; i < this.defaultSizeRuangan; i++) {
			
			for (int j = 0; j < this.defaultSizeRuangan; j++) {
				
				if(i ==0 || i== this.defaultSizeRuangan-1) {
					dummyWall = "_";
					
				}else {
					if((j==0) || (j==this.defaultSizeRuangan-1)) {
						dummyWall ="|";
					}else {
					dummyWall =" ";
					}

				}
				
				if(i== this.player.getCorY() && j == this.player.getCorX()) {
					
					dummyWall = player.getBentuk();
				}
				
				if (i== this.defaultSizeRuangan-1 && j == this.defaultSizeRuangan-1) {
					dummyWall =" ";
				}
				
				System.out.print(dummyWall);
			}
			
			System.out.println("");
			
		}
		
		
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getDefaultSizeRuangan() {
		return defaultSizeRuangan;
	}

	public void setDefaultSizeRuangan(int defaultSizeRuangan) {
		this.defaultSizeRuangan = defaultSizeRuangan;
	}

}
