package game.main;

import java.io.IOException;

import game.main.Keyboard;
import game.board.Board;
import game.score.Score;
import game.unit.Hunter;
import game.unit.Player;

/** 
 * This class contains the testing of every method used in the game 
 * 
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		char c;
		
	    Board board = new Board();
		Hunter h1 = new Hunter();
		//Hunter h2 = new Hunter();
		//Hunter h3 = new Hunter();
		//Hunter h4 = new Hunter();
		//Hunter h5 = new Hunter();
		Player p = new Player();
		Keyboard kb = new Keyboard();
		Score s =new Score();
	
		//if(board.getSpace(11,11)==20){
			//Hunter h1 = new Hunter();
			//h1.createH();
			//b.setSpace(11,11,2);
		//}
			
		board.setSpace(h1.getX(),h1.getY(),h1.getType());
		//board.setSpace(h2.getX(),h2.getY(),h2.getType());
		//board.setSpace(h3.getX(),h3.getY(),h3.getType());
		//board.setSpace(h4.getX(),h4.getY(),h4.getType());
		//board.setSpace(h5.getX(),h5.getY(),h5.getType());
		board.setSpace(p.getX(),p.getY(),p.getType());
		board.printBoard();
		System.out.println();
		
		
		
		//s.fHS();
		//s.setName(kb.readString());
		//s.saveScore();
		s.readScores();
		s.printScores();
		
		
		
		/*for(int i=0;i<100;i++){
			System.out.println("Make your move");
			board.setSpace(p.getX(),p.getY(),0);
			do{
				c=kb.readChar();
				if(c!='w' && c!='a' && c!='s' && c!='d')
					System.out.println("Invalid Move");
			}while(c!='w' && c!='a' && c!='s' && c!='d');
			p.moveTo(c);
			board.setSpace(p.getX(),p.getY(),p.getType());
			board.setSpace(h1.getX(),h1.getY(),0);
			//board.setSpace(h2.getX(),h2.getY(),0);
			//board.setSpace(h3.getX(),h3.getY(),0);
			//board.setSpace(h4.getX(),h4.getY(),0);
			//board.setSpace(h5.getX(),h5.getY(),0);
			h1.moveFromAI(p.getX(),p.getY());
			//h1.moveFromPath();
			//h2.moveFromPath();
			//h3.moveFromPath();
			//h4.moveFromPath();
			//h5.moveFromPath();
			if(h1.getX()==0 && h1.getY()==0)
				h1 = new Hunter();
			//if(h2.getX()==0 && h2.getY()==0)
			//	h2 = new Hunter();
			//if(h3.getX()==0 && h3.getY()==0)
			//	h3 = new Hunter();
			//if(h4.getX()==0 && h4.getY()==0)
			//	h4 = new Hunter();
			//if(h5.getX()==0 && h5.getY()==0)
			//	h5 = new Hunter();
			board.setSpace(h1.getX(),h1.getY(),h1.getType());
			//board.setSpace(h2.getX(),h2.getY(),h2.getType());
			//board.setSpace(h3.getX(),h3.getY(),h3.getType());
			//board.setSpace(h4.getX(),h4.getY(),h4.getType());
			//board.setSpace(h5.getX(),h5.getY(),h5.getType());
			if(p.getX()==h1.getX() && p.getY()==h1.getY())
				p.loseLife();
			//if(p.getX()==h2.getX() && p.getY()==h2.getY())
			//	p.loseLife();
			//if(p.getX()==h3.getX() && p.getY()==h3.getY())
			//	p.loseLife();
			//if(p.getX()==h4.getX() && p.getY()==h4.getY())
			//	p.loseLife();
			//if(p.getX()==h5.getX() && p.getY()==h5.getY())
			//	p.loseLife();
			
			System.out.print("HP: "+ p.getHP());
			board.printBoard();
			System.out.println();
			
			
		}*/
		
		//board.setSpace() ......
		//board.printBoard();
		//System.out.println();
		

	}

	

}
