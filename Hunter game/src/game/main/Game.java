package game.main;

import java.io.IOException;

import game.main.Keyboard;
import game.board.Board;
import game.level.Level;
import game.score.Score;
import game.unit.Hunter;
import game.unit.Player;

/**
 *  This class contains the game machanics and the navigations from the 
 *  manues that the player is able to see at the start of the game
 * 
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class Game {

	private Keyboard kb = new Keyboard();
	private Board board = new Board();
	private Score s = new Score();
	private Level l = new Level();
	private Player p = new Player();
	private Hunter h1 = new Hunter();
	private Hunter h2 = new Hunter();
	private Hunter h3 = new Hunter();
	private Hunter h4 = new Hunter();
	private Hunter h5 = new Hunter();
	
	/**
	 *  Prints the start menu of the game and gives the user choise what to do from here
	 * @throws IOException
	 */
	public void startMenu() throws IOException{
	
		boolean w = false;
		String user;
		
		s.readScores();
		
		System.out.println("To play game type: play");
		System.out.println("To view highscores type: scores");
		do{
			user=kb.readString();
			if (user.equals("play")){
				w = true;
				levelMenu();
			}else if(user.equals("scores")){
				w = true;
				s.printScores();
				System.out.println();
				startMenu();
			}else{
				System.out.println("Invalid imput, try again");
				System.out.println();
				startMenu();
			}
		}while(w=false);
	}
	
	/**
	 * Prints the level choise menu of the game and gives the user choise which level he wants to play
	 * @throws IOException
	 */
	public void levelMenu() throws IOException{
		
		boolean w = false;
		int user;
		
		System.out.println();
		System.out.println();
		
		System.out.println("For level one type: 1");
		System.out.println("For level one and two type: 2");
		do{
			user=kb.readInt();
			if(user==1){
				w = true;
				l.setLevel(1);
				playGame();
			}else if(user==2){
				w = true;
				l.setLevel(2);
				playGame();
			}else{
				System.out.println("Invalid imput, try again");
				levelMenu();
			}
		}while(w=false);
	}
	
	/**
	 * The actual game loop that includes every move of the player and the hunter and all the checks needed for the game
	 * @throws IOException
	 */
	public void playGame() throws IOException{
		
		int i=1;
		int currLevel=1;
		char c;
		
		System.out.println();
		System.out.println();
		
		board.setSpace(h1.getX(),h1.getY(),h1.getType());
		board.setSpace(p.getX(),p.getY(),p.getType());
		board.printBoard();
		
		/**
		 *  The main loop of the game
		 */
		do{
			/**
			 *  Spawns additional hunters based on the game progress
			 */
		if(i>2)
			board.setSpace(h2.getX(),h2.getY(),h2.getType());
		if(i>4)
			board.setSpace(h3.getX(),h3.getY(),h3.getType());
		if(i>6)
			board.setSpace(h4.getX(),h4.getY(),h4.getType());
		if(i>8)
			board.setSpace(h5.getX(),h5.getY(),h5.getType());
			
		/**
		 *  The player movement 
		 */
		System.out.println();
		System.out.println("Make your move");
		board.setSpace(p.getX(),p.getY(),0);
		do{
			c=kb.readChar();
			if(c!='g' && c!='h' && c!='j' && c!='k')
			System.out.println("Invalid Move");
		}while(c!='g' && c!='h' && c!='j' && c!='k');
		p.moveTo(c);
		board.setSpace(p.getX(),p.getY(),p.getType());
		
		/**
		 *  Check if the player have hitted a hunter with his move to lose a life 
		 */
		if(p.getX()==h1.getX() && p.getY()==h1.getY()){
			p.loseHP();
			h1 = new Hunter();
		}
		if(i>2)
			if(p.getX()==h2.getX() && p.getY()==h2.getY()){
				p.loseHP();
				h2 = new Hunter();
			}
		if(i>4)
			if(p.getX()==h3.getX() && p.getY()==h3.getY()){
				p.loseHP();
				h3 = new Hunter();
			}
		if(i>6)
			if(p.getX()==h4.getX() && p.getY()==h4.getY()){
				p.loseHP();
				h4 = new Hunter();
			}
		if(i>8)
			if(p.getX()==h5.getX() && p.getY()==h5.getY()){
				p.loseHP();
				h5 = new Hunter();
			}
		
		/**
		 *  Check if the hunter have reached the top to increase the player 
		 *  score and respawn the hunnter in the bottum left corner
		 */
		if(h1.getX()==0 && h1.getY()==0){
			board.setSpace(h1.getX(),h1.getY(),0);
			h1 = new Hunter();
			if(currLevel==1)
				s.incScoreByOne();
			if(currLevel==2)
				s.incScoreByTwo();
		}
		if(i>2){
			if(h2.getX()==0 && h2.getY()==0){
				board.setSpace(h2.getX(),h2.getY(),0);
				h2 = new Hunter();
				if(currLevel==1)
					s.incScoreByOne();
				if(currLevel==2)
					s.incScoreByTwo();
			}
		}
		if(i>4){
			if(h3.getX()==0 && h3.getY()==0){
				board.setSpace(h3.getX(),h3.getY(),0);
				h3 = new Hunter();
				if(currLevel==1)
					s.incScoreByOne();
				if(currLevel==2)
					s.incScoreByTwo();
			}
		}
		if(i>6){
			if(h4.getX()==0 && h4.getY()==0){
				board.setSpace(h4.getX(),h4.getY(),0);
				h4 = new Hunter();
				if(currLevel==1)
					s.incScoreByOne();
				if(currLevel==2)
					s.incScoreByTwo();
			}
		}
		if(i>8){
			if(h5.getX()==0 && h5.getY()==0){
				board.setSpace(h5.getX(),h5.getY(),0);
				h5 = new Hunter();
				if(currLevel==1)
					s.incScoreByOne();
				if(currLevel==2)
					s.incScoreByTwo();
			}
		}
		
		/**
		 *  Change hunters possitions in the board array
		 */
		board.setSpace(h1.getX(),h1.getY(),0);
		if(i>2)
			board.setSpace(h2.getX(),h2.getY(),0);
		if(i>4)
			board.setSpace(h3.getX(),h3.getY(),0);
		if(i>6)
			board.setSpace(h4.getX(),h4.getY(),0);
		if(i>8)
			board.setSpace(h5.getX(),h5.getY(),0);
		
		/**
		 *  Moves the hunter for level 1 from the predefined path
		 */
		if(currLevel==1){
			h1.moveFromPath();
			if(i>2)
				h2.moveFromPath();
			if(i>4)
				h3.moveFromPath();
			if(i>6)
				h4.moveFromPath();
			if(i>8)
				h5.moveFromPath();
		}
		
		/**
		 *  Moves the hunter for level 2 based on the possition of the player
		 */
		if(currLevel==2){
			h1.moveFromAI(p.getX(),p.getY());
			if(i>2)
				h2.moveFromAI(p.getX(),p.getY());
			if(i>4)
				h3.moveFromAI(p.getX(),p.getY());
			if(i>6)
				h4.moveFromAI(p.getX(),p.getY());
			if(i>8)
				h5.moveFromAI(p.getX(),p.getY());
		}
		
		board.setSpace(h1.getX(),h1.getY(),h1.getType());
		if(i>2)
			board.setSpace(h2.getX(),h2.getY(),h2.getType());
		if(i>4)
			board.setSpace(h3.getX(),h3.getY(),h3.getType());
		if(i>6)
			board.setSpace(h4.getX(),h4.getY(),h4.getType());
		if(i>8)
			board.setSpace(h5.getX(),h5.getY(),h5.getType());
		
		/**
		 *  Check if the hunter have managed to catch a player so he can lose a life
		 */
		if(p.getX()==h1.getX() && p.getY()==h1.getY()){
			p.loseHP();
			h1 = new Hunter();
		}
		if(i>2)
			if(p.getX()==h2.getX() && p.getY()==h2.getY()){
				p.loseHP();
				h2 = new Hunter();
			}
		if(i>4)
			if(p.getX()==h3.getX() && p.getY()==h3.getY()){
				p.loseHP();
				h3 = new Hunter();
			}
		if(i>6)
			if(p.getX()==h4.getX() && p.getY()==h4.getY()){
				p.loseHP();
				h4 = new Hunter();
			}
		if(i>8)
			if(p.getX()==h5.getX() && p.getY()==h5.getY()){
				p.loseHP();
				h5 = new Hunter();
			}
		
		System.out.print("Strength: "+ p.getHP()+" Score: "+s.getScore()+" Current Level: "+ currLevel);
		//board.setSpace(0,0,0);
		board.printBoard();
		System.out.println();			
		
		/**
		 *  Check if the player have reached the needed score to pass to level 2 if it was selected in the start
		 */
		if(l.getLevel()==2 && s.getScore()==42 && currLevel==1){
			board = new Board();
			p = new Player();
			h1 = new Hunter();
			h2 = new Hunter();
			h3 = new Hunter();
			h4 = new Hunter();
			h5 = new Hunter();
			i=0;
			currLevel=2;
		}
		i++;
		}while(p.getHP()>=1);
		
		/**
		 *  Resets the board the player and the hunters so they are avaivable for a new game
		 */
		board = new Board();
		p = new Player();
		h1 = new Hunter();
		h2 = new Hunter();
		h3 = new Hunter();
		h4 = new Hunter();
		h5 = new Hunter();
		
		/**
		 *  Saves your score if it is good enough and returns you to the start menu of the game
		 */
		System.out.println("Game Over");
		System.out.println(s.getScore());
		System.out.println();
		System.out.println("Enter your name: ");
		s.checkAndSort(kb.readString());
		s = new Score();
		startMenu();
	}
	
}
