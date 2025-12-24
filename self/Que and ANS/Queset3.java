
public class Queset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//#Q1 drow a praten
//		int n=5;
//		for(int row=n; row>0; row--) {
//			for(int col=0; col<row; col++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}

//#Q2 Write a program to sum first n even numbers using a while loop.	
//		int sum=0;
//		int n=3; 
//		for(int i=0; i<n; i++) {
//			sum= sum+(2*i);
//		}
//		System.out.println(sum);
	
//#Q3 Write a program to print the multiplication table of a given number n.	
//	 int n=15;
//	 for(int i=1;i<=10; i++) {
//		 System.out.println(n*i);
//	 }
	
//#Q4 Write a program to print a multiplication table of 10 in reverse order.
//	int n=8;
//	for(int i=10; i>=1; i--) {
//		System.out.printf("%d * %d = %d\n", n, i, n*i);
//	}	
//#Q5 Write a program to find the factorial of a given number using for loops.		
//		int n=5;
//		int i=1;
//		int sum=1;
//		while(i<=n) {  
//			sum *=i;
//			i++;
//		}
//		System.out.println(sum);
		
//Q6 Write a program to calculate the sum of the numbers occurring in the multiplication table of 8	
		int n=8;
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum +=n*i;
		}
		System.out.println(sum);
		
		
		
		 
	 
	}

}
