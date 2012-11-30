package game.board;

/**
 *  This class contains the information and the methods stored in the board of the game
 *  
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class Board {

	//private int x;
	//private int y;
	private int[][] board;
	
	/**
	 *  Constructor for the board
	 */
	public Board(){
		board = new int[12][12];
		for (int i=0;i<=11;i++){
			for (int j=0;j<=11;j++){
				board[i][j]=0;
				//System.out.print(board[i][j]);
			}
		}
		//System.out.println("Field Ready");
	}
	
	/**
	 *  Sets a value in the board if there is a hunter or a player
	 *  
	 * @param x
	 * @param y
	 * @param t - if 0 space is empty if 1 it's player if 2 it's hunter
	 */
	public void setSpace(int x,int y,int t){
		board[x][y]=t;
	}
	
	/**
	 *  Prints the board on the screan with different symbols from 0,1,2 for the player
	 */
	public void printBoard(){
		for (int i=0;i<=11;i++){
			System.out.println();
			for (int j=0;j<=11;j++){
				if(board[i][j]==0)
					System.out.print("|_|");
				if(board[i][j]==1)
					System.out.print(" P ");
				if(board[i][j]==2)
					System.out.print(" H ");
			}
		}
		
	}
	
}
