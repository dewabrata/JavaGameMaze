package com.juaracoding.maze.animation;

import java.io.IOException;

public class Utility {
	
	
	public static void clearScreen() {
		 try {
 	        if (System.getProperty("os.name").contains("Windows"))
 	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
 	        else
 	            Runtime.getRuntime().exec("clear");
 	    } catch (IOException | InterruptedException ex) {}

	}
	
	public static void delay(long millisecond) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
