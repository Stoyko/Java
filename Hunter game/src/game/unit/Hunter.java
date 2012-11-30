package game.unit;

import java.util.Random;;

/**
 *  This class contain the additional fuctionality of the hunter and his methods
 * 
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class Hunter extends Character{
	
	private int type=2;
	private int[] path = new int[22];
	private int a=0;
	
	private Random rg = new Random();
	
	/**
	 *  Constructor for the Hunter
	 */
	public Hunter() {
		setX(11);
		setY(11);
		createPath();
	}
	
	/**
	 *  Creates a random predifined path for each hunter when he is spawned
	 */
	public void createPath(){
		int n=0;
		int m=0;
		for(int i=0;i<22;i++){
			path[i]=rg.nextInt(2);
			if(path[i]==0){
				n++;
				if(n==12){
					path[i]=1;
					n--;
				}
			}
			if(path[i]==1){
				m++;
				if(m==12){
					path[i]=0;
					m--;
				}
			}
		}
	}
	
	/**
	 *  Moves the hunter from that predifined path for level 1 
	 */
	public void moveFromPath(){
		if (path[a]==0)
			moveUp();
		else moveLeft();
		a++;
	}
	
	/**
	 *  Returns a value witch indicates that this is a hunter in the board class
	 *  
	 * @return
	 */
	public int getType(){
		return type;
	}
	
	/**
	 *  Moves the hunter based on the possition of the player for level 2
	 *  
	 * @param x1
	 * @param y1
	 */
	public void moveFromAI(int x1,int y1){
		x1=getX()-x1;
		y1=getY()-y1;
		if(x1>=0 && y1>=0){
			if(x1<y1)
				moveLeft();
			else moveUp();
		}else if (getX()!=0)
				moveUp();
		else moveLeft();
			
	}
	
}
