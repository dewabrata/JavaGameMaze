package com.juaracoding.maze.controller;

import java.util.Scanner;

import com.juaracoding.maze.animation.Labirin;
import com.juaracoding.maze.animation.Player;

public class Controller {
	Player player;
	Labirin labirin;
	String movement = "";
	
	
	public Controller() {
		this.player = new Player("o", 5, 10);
	    this.labirin = new Labirin(15,player);
		

	}
	
	public Controller(Player player , Labirin labirin) {
		this.player = player;
	    this.labirin = labirin;
		

	}
	
	public void start() {
		
		do {
		labirin.draw();
		System.out.println("Gerakan player anda awsd =>");
		Scanner scan = new Scanner(System.in);
	    movement  = scan.next().toUpperCase();
	    playerMovement(movement);
		}while(!movement.equalsIgnoreCase("X"));
		
		
	}  
	
	
	private void playerMovement (String move) {
		
		switch (move) {
		case "A":
			
			if(labirin.getPlayer().getCorX()>1) {
			labirin.getPlayer().moveLeft();
			}else {
				checkGame();
			}
			
			break;
		case "D":
			if(labirin.getPlayer().getCorX()< labirin.getDefaultSizeRuangan()-2) {
			labirin.getPlayer().moveRight();
			}else {
				checkGame();
			}
			
			break;
		case "W":
			if(labirin.getPlayer().getCorY()>1) {
			labirin.getPlayer().moveUp();
			}else {
				checkGame();
			}
			
			break;
		case "S":
			if(labirin.getPlayer().getCorY()< labirin.getDefaultSizeRuangan()-2) {
			labirin.getPlayer().moveDown();
			}else {
				checkGame();
			}
			
			break;
		default:
			break;
		}
		
	}
	
	
	private void checkGame () {
		
		if (labirin.getPlayer().getCorX()== labirin.getDefaultSizeRuangan()-2 && labirin.getPlayer().getCorY() == labirin.getDefaultSizeRuangan()-2) {
			
			System.out.println("Anda Menang");
			this.movement="X";
			
		}
		
	}
	
	
	
}
