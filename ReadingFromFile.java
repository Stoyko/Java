public class ReadingFromFile {

	String[] contentOfFile = new String[100];

	public void read()throws IOException{
		
		Scaner name = new Scanner(System.in);
		System.out.prinln("Give name of file : " );
		String nameOfFile = userInput.nextLine();
		
		if(nameOfFilen!=null){
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
}