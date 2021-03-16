package com.juaracoding.maze.animation;

public class Player {
	
	private String bentuk = "x";
	
	private int corX = 1;
	private int corY= 1 ;
	
	public Player(String bentuk, int corX, int corY) {
	
		this.bentuk = bentuk;
		this.corX = corX;
		this.corY = corY;
	}

	
	public Player() {
		
	}
	public int getCorX() {
		return corX;
	}

	public void setCorX(int corX) {
		this.corX = corX;
	}

	public int getCorY() {
		return corY;
	}

	public void setCorY(int corY) {
		this.corY = corY;
	}


	public String getBentuk() {
		return bentuk;
	}


	public void setBentuk(String bentuk) {
		this.bentuk = bentuk;
	}
	
	
	public void moveUp() {
		this.corY--;
	}
	
	public void moveDown() {
		this.corY++;
		
	}
	
	public void moveLeft() {
		this.corX--;
		
	}
	
	public void moveRight() {
		this.corX++;
	}
	
	

}
