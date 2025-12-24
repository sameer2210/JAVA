public class Test3Sol {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	int totalWord = 0;
	
	try{
		 System.out.println(" how many words do you want to store ? " );
		 totalWord = scan.nextInt();
			String wordList[] = new String[totalWord];
			
			for(int w=1; w<=wordList.length;w++){
				System.out.println(" enter word# " + w );
				String word = scan.next();
				wordList[w-1] = word;
			}
			System.out.println(java.util.Arrays.toString(wordList));
	}catch(NegativeArraySizeException e){
		System.out.println(" Error : size must not be -ve no. :: " + totalWord);
	}catch(java.util.InputMismatchException e){
		System.out.println(" Error : word size must be integer type ");
	}catch(Exception e){
		System.out.println(" other Error " + e.getMessage());
	}
	
	}//end  main
 }//end class