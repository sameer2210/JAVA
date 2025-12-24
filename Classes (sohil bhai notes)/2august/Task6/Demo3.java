public class Demo3 {
	public static void main(String args[])throws Exception{
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("how many number required");
	int totalInput =scan.nextInt();
	int userData[] = new int[totalInput];
	//get all five number as input from keyboard
	
	for(int sno=1;sno<=userData.length;sno++){
	System.out.println("enter # "+sno +"number");
	int inputNum  = scan.nextInt();
	userData[sno-1]=inputNum;
	}
	
	//show
	int totalSum =0;
	for(int sno=1;sno<=userData.length;sno++){
	//Delay
	Thread.sleep(1000);
	int value = userData[sno-1];
		totalSum +=value;
	System.out.println("#" + sno +" = "+value);
	}
	System.out.println("total sum"+" = " + totalSum);
	
}
}
