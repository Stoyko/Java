package game.level;

/**
 *  This class contains the level and it's methods
 *
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */

public class Level {
	
	private int level;

	/**
	 *  Allows the player to set which levels of difficulty he wants to play at the start of the game
	 *  
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 *  Returns the level of difficulty that the player have selected upon starting the game
	 *  
	 * @return
	 */
	public int getLevel() {
		return level;
	}
	
}
