import java.util.Date;
import java.util.Random;
	
public class Demo1{
	public static void main (String args[]) throws Exception {
	
	//java.util.Date d1 = new java.util.Date();
	//Thread.sleep(1000);
	
	System.out.println("crearted...");
	Date d1 = new Date();
	Thread.sleep(1000);
	System.out.println("created...");
	Date d2 = new Date();
	Thread.sleep(1000);
	System.out.println("created...");
	Date d3 = new Date();
	Thread.sleep(1000);
	System.out.println("created...");
	Thread.sleep(1000);
	Date d4 = new Date();
	
	//java.util.Random rand = new java.util.Random();
	Random rand = new Random();

	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
	
	Date [] myDates = new Date[4];
	myDates[0]=d2;
	myDates[1]=d4;
	myDates[2]=d1;
	myDates[3]=d3;
	System.out.println("_______before sort________");
	for(int p=1;p<=myDates.length;p++){
		System.out.println("d1 = " + myDates[p-1]);
	}
	//sort using api
	java.util.Arrays.sort(myDates);
	System.out.println("___________after sort_________");
	for(int p=1;p<=myDates.length;p++){
		System.out.println("d1 = " + myDates[p-1]);
	}

}
}
