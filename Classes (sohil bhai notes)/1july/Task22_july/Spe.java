public class Spe {
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);

	System.out.println("enter integer type number");
	long num=scan.nextLong();
	long temp =num;
/*	
	long sum=0;	//total sum of all digits
	long rev=0;
	
	while(temp!=0){
		long r = temp%10;
		temp = temp/10;
		rev = rev*10+r;
		sum = sum +r;
		sum = sum +r;
		//System.out.print(r+",");
	}
	System.out.println("sum = " +sum);
	System.out.println("rev = " + rev);
*/
System.out.println("___________________________________________");
	
	long sumC=0;

	while(temp!=0){
		long r = temp % 10;
		temp =temp/10;
		long digitC=(r*r*r);
		System.out.println(r +"^3 = "+digitC);
		sumC = sumC + digitC;
	}
	System.out.println("sumC = "+sumC);
	System.out.println(num==sumC?"armstrong":"NOT armstrong");
		

}
}