import java.text.SimpleDateFormat;
import java.util.Date;
public class Task1 {

	public static void main (String [] args){

 	int a=10;
	a=a+1;
	System.out.println(a);	//11
	a +=1;
	System.out.println(a);	//12

	char ch;
	ch='A';
	ch =' ';
	System.out.println("+++"+ ch +"+++");	//+++  +++

System.out.println("-----------______________-------------------------------");

	java.util.Scanner scan= new java.util.Scanner(System.in);

	String studentName_2001_batch=null;
	Date now = new Date();
	java.util.Date dob = null;

	System.out.println(studentName_2001_batch);
	System.out.println(now);
	System.out.println(dob);
	
	now = new java.util.Date();
	studentName_2001_batch ="sameer";
	String enteredDob = scan.nextLine();

	System.out.println("________________");
	System.out.println(now);			//sun aug 22  time...
	System.out.println(enteredDob );			//
	System.out.println(studentName_2001_batch);	//sameer

	Date date = new Date();  
    	System.out.println("Date : "+date); 
    	SimpleDateFormat formatter = new SimpleDateFormat("dddd MMMM  dd-yyyy-MM a");  
    	String strDate = formatter.format(date);  
    	System.out.println("Date Format with MM/dd/yyyy : "+strDate); 
}
}