public class Digitsum {
	public static void main(String args[]){
		java.util.Scanner scan =new java.util.Scanner(System.in);
		System.out.println("enter 3 digit int number");
		int num=scan.nextInt();
		int temp =num;
		int d1;
		int d2;
		int d3;
		int sum=0;
		
		d1 = temp%10;
		temp = temp/10;
		
		d2 = temp%10;
		temp = temp/10;
	
		d3 = temp%10;
		temp = temp/10;
	
		sum = sum +d1;
		sum = sum +d2;
		sum = sum +d3;
	
		System.out.println("**************************************");
		System.out.println("sum "+sum);
	
		System.out.println("**************************************");
		int rev = 100*d1+10*d2+1*d3;
		System.out.println("rev = "+rev);
	
		System.out.println("***************************************");
		System.out.println(num==rev?"Palindrom":"NOT palindrom");
	
	System.out.println();
	
System.out.println("______________________________________________");

	long startTime = System.nanoTime();
	System.out.println("I m engineer!");
	long endTime = System.nanoTime();
	System.out.println("totalTime= "+ (endTime-startTime)+"ns");
	
}
}

