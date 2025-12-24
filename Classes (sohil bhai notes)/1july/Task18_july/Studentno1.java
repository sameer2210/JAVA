public class Studentno1 {
	public static void main (String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	
	String allData="";
	final int TOTAL_REQUIRED_NO=5;
	int totalInputNumber=1;

	while(totalInputNumber<=TOTAL_REQUIRED_NO){
	  //todo 1 input
	System.out.println("enter your number #"+totalInputNumber);
	int inputNum = scan.nextInt();
/*
	//todo 2 process
	allData = allData +"sno#" +totalInputNumber+":"+inputNum+"\n";
	//todo 3 next counter update++
	totalInputNumber++;
	
	}
	System.out.println("*******************************");
	System.out.println("all number are bellow:");
	System.out.println(allData);
*/		
System.out.println("_______________________________________________");

	//todo 2 process
	java.util.Date now = new java.util.Date();
	String temp ="";
	temp = temp+now;
	temp = temp.substring(11,19);

	allData = allData +"sno#" +totalInputNumber +":"+inputNum+"::"+temp+"\n";
	//todo 3 next conter update ++
	totalInputNumber++;
	}
	
	System.out.println("**********************************************");
	System.out.println("all numbers are bellow:");
	System.out.println(allData);

System.out.println("______________________________________________");

}
}	