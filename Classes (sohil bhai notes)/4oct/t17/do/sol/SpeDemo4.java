import java.util.Date;

public class SpeDemo4 {
	public static void main(String args[]){
	
	Date d1 = new Date();
	System.out.println(d1);		//date ptint.... sat oct l.....
	System.out.println(d1.toString());		//Sat Oct 10 08:.....
	System.out.println("________________________");
	
	Student s1 = new Student(1001," doremon ","male", 22 ," mca "," nit ",3,88.8f," d@gmail.com ","1234576789");
	Student s2 = new Student(1002," nobita ","male", 21 ," mca "," nit ",3,78.8f," n@gmail.com ","123457634789");
	Student s3 = new Student(1003," sizuka ","female", 18 ," mca "," nit ",3,98.8f," s@gmail.com ","1234576789");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("______________________");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println("______________________");
			
	
	}//end main
}//end class