package game.unit;

/**
 *  This class contains the overlaping functionality of the player and the hunter
 * 
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class Character {

	/**
	 *  Those integers saves the location of the unit in the board
	 */
	private int x;
	private int y;
	
	/**
	 *  This method moves the unit left
	 *  
	 * @return
	 */
	public int moveLeft(){
		if(getY()!=0){
			setY(getY() - 1);
		}
		return getY();
	}

	/**
	 *  This method moves the unit up
	 *  
	 * @return
	 */
	public int moveUp(){
		if(x!=0){
			setX(getX() - 1);
		}
		return getX();
	}
	
	/**
	 *  Setter
	 *  
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 *  Getter
	 *  
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 *  Setter
	 *  
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 *  Getter
	 *  
	 * @return
	 */
	public int getY() {
		return y;
	}

}
