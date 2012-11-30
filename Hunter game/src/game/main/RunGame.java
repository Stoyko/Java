package game.main;

import java.io.IOException;

/**
 *  This class calls the start menu of the game and everything else is executed from it
 * 
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class RunGame {

	public static void main(String[] args) throws IOException {
	
		Game g = new Game();
		
		g.startMenu();

	}

}
