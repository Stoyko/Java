public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		numbers[0]=1;
		numbers[1]=5;
		numbers[2]=9;
		numbers[3]=0;
		numbers[4]=8;
		numbers[5]=3;
		numbers[6]=4;
		numbers[7]=7;
		numbers[8]=2;
		numbers[9]=6;
		
		numbers = sort(numbers);
		
		for(int h=0;h<numbers.length;h++)
			System.out.println(numbers[h]);
		
	}
		
		
	public static int[] sort(int[] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input.length;j++){
				if(input[i]<input[j]){
				//for accending order change the to '>'
					int k = input[i];
					input[i] = input[j];
					input[j] = k;
				}
			}
		}
		return input;
	}

}