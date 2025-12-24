
public class Test3 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println(" how many words do you want to Store ? " );
	int totalWord = scan.nextInt();
	String wordList[] = new String[totalWord];
	
	for( int w=1; w<=wordList.length;w++ ){
		System.out.println("enter word# " + w);
		String word = scan.next();
		wordList[w-1] = word;
	}
	System.out.println(java.util.Arrays.toString(wordList));
		
	
	}//end main 
}//end class