package game.score;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  This class contains the score system and it's methods 
 * 
 * @version 1.0 12/09/11
 * @author Stoyko Kodzhabashev
 */
public class Score {

	private int[] highScore;
	private String[] hNames;
	private int score;
	
	/**
	 *  Constructor for the Score class
	 */
	public Score(){
		highScore = new int[10];
		hNames = new String[10];
		score=0;
	}
	
	/**
	 *  Test method which was used in the Test Class 
	 */
	public void fHS(){
		for(int i=0;i<10;i++){
			highScore[i]=score;
		}
	}
	
	/**
	 *  This method read all the scores from a file called HighScore 
	 *  and saves the names and their scores in two different arrays
	 *  
	 * @throws IOException
	 */
	public void readScores()throws IOException{
		
		int c;
		BufferedReader br = new BufferedReader(new FileReader("HighScore.txt"));
		
		for(int i=0;i<10;i++){
			String x = br.readLine();
			String z = br.readLine();
			c = Integer.parseInt(x);
			highScore[i]=c;
			hNames[i]=z;
		}
		br.close();
	}
	
	/**
	 *  This method saves the new scores from the 2 arrays into the HighScore file
	 *  
	 * @throws IOException
	 */
	public void saveScores() throws IOException{   
		       		
		BufferedWriter bw = new BufferedWriter(new FileWriter("HighScore.txt"));
		
		for(int i=0;i<10;i++){
			bw.write(Integer.toString(highScore[i]));
			bw.newLine();
			bw.write(hNames[i]);
			bw.newLine();
		}
		bw.close();
	}
	
	/**
	 *  This method first checks if the player score is better than the once
	 *   inside the HighScore file and if so over write the new one on it's place 
	 *   then sorts all the scores read from the file
	 *   
	 * @param name
	 * @throws IOException
	 */
	
	public void checkAndSort(String name) throws IOException{
	
		for(int i=9;i>=0;i--){
			if(score>highScore[i]){
				highScore[i]=score;
				hNames[i]=name;
				i=-1;
			}
		}
		
		for(int ii = 0; ii < highScore.length-1; ii++){
			for(int jj = highScore.length-1;jj > ii;jj--){
				if(((Comparable)highScore[jj]).compareTo(highScore[jj-1])>0){
					int m = highScore[jj];
					highScore[jj]=highScore[jj-1];
					highScore[jj-1]=m;
					String n = hNames[jj];
					hNames[jj]=hNames[jj-1];
					hNames[jj-1]=n;
				}
			}
		}
		
	saveScores();
	}
	
	/**
	 *  Increases the player score by one for the first level of difficulty
	 */
	public void incScoreByOne(){
		score++;
	}
	
	/**
	 *  Increases the player score by two for the second level of difficulty
	 */
	public void incScoreByTwo(){
		score++;
		score++;
	}
	
	/**
	 *  Returns the current score of the player
	 *   
	 * @return
	 */
	public int getScore(){
		return score;
	}
	
	/**
	 *  Print the all the highscores for the moment
	 */
	public void printScores(){
		for(int i=0;i<10;i++){
			System.out.print(highScore[i]);
			System.out.println(" "+hNames[i]);
		}
	}
	
	/**
	 * Method used in the Test Class
	 */
	//public void setName(String name){
	//	this.name = name;
	//}
	
}
