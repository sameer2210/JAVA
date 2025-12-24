public class Loop1 {
	public static void  main(String args[]) {


//loop	
	for(int i = 1;i<= 10;i++){
		System.out.println(i);	
		}

System.out.println("____________________________________________");

//java Nested for Loop

	// loop of i
	for(int i = 1;i<=5;i++){
	//loop of j
	for(int j = 1;j<=5;j++){
		System.out.println(i+" "+j);
	}//end of i
	}//end of j

System.out.println("____________________________________________");

//pyramid Loop example

	for(int i=1;i<=5;i++){
	for(int j=1;j<=i;j++){
		System.out.print("* ");
	}
	System.out.println();
	}
System.out.println("____________________________________________");


//pyramid Loop example
	
	int term=6;
	for(int i=1;i<=term;i++){
	for(int j=term;j>=i;j--){
		System.out.print("* ");
	}
	System.out.println();	
	}
	

}			
}			