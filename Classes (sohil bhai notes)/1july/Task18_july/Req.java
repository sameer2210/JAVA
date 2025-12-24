public class Req {
	public static void main(String args[])throws Exception{

	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("how many second required?");
	int totalSecond =scan.nextInt();
	while(totalSecond>=1){
		Thread.sleep(1000);
		System.out.println(totalSecond);
		totalSecond--;
	}
	System.out.println("GO");

System.out.println("_____________________________________________");


	final int totalReqNumbers=10;
	int createdTotalNumber=1;
	while(createdTotalNumber<=totalReqNumbers){
	 Thread.sleep(1000);
	  int generatedNumber = (int)(Math.random()*1000);
	  System.out.println("sno"+createdTotalNumber+" = " +generatedNumber);
	  createdTotalNumber++;
	}
	
}
}