public class Sisreq1 {
	public static void main(String args[]){

	int num=123456789;
	int temp =num;
	
	int sum=0;
	long startTime = System.currentTimeMillis();
	//long startTime = System.nanoTime();
		while(temp!=0){
			int r =temp%10;
			temp =temp/10;
			sum =sum + r;
		}
	long endTime = System.nanoTime();
		System.out.println("totalTime= "+(endTime)+"ns");
		System.out.println("num= "+ num);
		System.out.println("sum= "+ sum);

System.out.println("______________________________________");
/*
	//nth term sum
	int num=123456789;
		
	long startTime = System.nanoTime();
	int d= num%10;
	int sum= (d*(d+1) )/2;	//total sum of all digits
	long endTime = System.nanoTime();
		System.out.println("totalTime="+(endTime-startTime)+"ns");
		System.out.println("num= "+ num);
		System.out.println("sum="+ sum);
*/
}
}