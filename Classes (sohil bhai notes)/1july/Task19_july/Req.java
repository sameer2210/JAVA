public class Req {
	public static void main(String args[])throws Exception{
	
	for(int reqNum=1;reqNum<=5;reqNum++){
	Thread.sleep(1000);
	double temp = Math.random();
/*
	int num = (int)(temp*10000);
	//System.out.println(num);
	System.out.println("sno#"+reqNum +"=" +num);
	}
*/
System.out.println("_____________________________________________");
	
	int num = (int)(temp*100);
	int ascii = (num%26) +65;
	char ch = (char)ascii;

	System.out.println("sno#" +reqNum+" "+ascii +" = " +ch);
	}
System.out.println("_____________________________________________");


}
}