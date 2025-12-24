public class Mathdemo {
	public static void main(String args[]){
	
	double n1 = Math.random();
	
	System.out.println(n1);
	System.out.println(n1*10);
	System.out.println(n1*100);
	System.out.println(n1*1000);
	System.out.println("__________________________________");

	System.out.println((int)(n1*10));
	System.out.println((int)(n1*100));
	System.out.println((int)(n1*1000));

	System.out.println("__________________________________");

	int myNum1 = (int)(n1*10);
	System.out.println("myNum1 = " +myNum1);
	
	int myNum2 = ((int)(n1*100));
	System.out.println("myNum2 = "+myNum2);
	

}
}


