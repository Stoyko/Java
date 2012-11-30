public class ReadingFromFile {

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;


	private String[] contentOfFile = new String[100];

	public void read()throws IOException{
		
		Scanner name = new Scanner(System.in);
		System.out.println("Give name of file : " );
		String nameOfFile = userInput.nextLine();
		
		if(nameOfFile!=null){
			BufferedReader br = new BufferedReader(new FileReader(nameOfFile+".txt"));
		
			for(int i=0;i<100;i++){
				String x = br.readLine();
				if(x == null)
					break;
				contentOfFile[i]=x;
			}
			br.close();
		}
	}
	
	public String[] getContentOfFile() {
		return contentOfFile;
	}

	public void setContentOfFile(String[] contentOfFile) {
		this.contentOfFile = contentOfFile;
	}
	
}