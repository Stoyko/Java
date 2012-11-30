package game.unit;

/**
 *  This class contains the advanced funcionality of the player for the game
 * 
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class Player extends Character {

	private int type=1;
	private int hP=5;
	
	/**
	 *  Constructor for the player
	 */
	public Player(){
		setX(0);
		setY(0);
	}
	
	/**
	 *  This method moves the player down
	 *  
	 * @return
	 */
	public int moveDown(){
		if(getX()!=11){
			setX(getX() + 1);
		}
		return getX();
	}
	
	/**
	 *  This method moves the player right
	 *  
	 * @return
	 */
	public int moveRight(){
		if(getY()!=11){
			setY(getY() + 1);
		}
		return getY();
	}
	
	/**
	 *  This method reads the direction in which the player
	 *  have chosen to move and moves calls one of the 4 move methods
	 *  
	 * @param c
	 */
	public void moveTo(char c){
		switch (c) {
		case 'j':
			moveUp();
			break;
		case 'g':
			moveLeft();
			break;
		case 'k':
			moveDown();
			break;
		case 'h':
			moveRight();
			break;
		}
	}
	
	/**
	 *  This method reduces the player current heath
	 */
	public void loseHP(){
		hP--;
	}
	
	/**
	 *  This method returns the player current heath
	 *  
	 * @return
	 */
	public int getHP(){
		return hP;
	}
	
	/**
	 *  This method returns a value that indicates that this is a player
	 *  
	 * @return
	 */
	public int getType(){
		return type;
	}
	
}
