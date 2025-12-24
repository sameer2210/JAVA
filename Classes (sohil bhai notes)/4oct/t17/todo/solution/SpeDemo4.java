import java.util.Date;



public class SpeDemo4 {

	public static void main(String[] args) {
		 Date d1  = new Date();
		 System.out.println(d1);//Sat Oct 10 08:07:56 IST 2020
		 System.out.println(d1.toString());//Sat Oct 10 08:07:56 IST 2020
		 System.out.println("______________________");
		
		 System.out.println("______________________");
		 Student s1  = new Student(1001, "ramesh", "male", 22, "mca", "nit", 3, 88.8f, "r@gmail.com", "123456789");
		 Student s2  = new Student(1002, "Gita", "fmale", 21, "mca", "nit", 3, 78.8f, "g@gmail.com", "123456234");
		 Student s3  = new Student(1003, "rita", "fmale", 22, "it", "nit", 3, 89.8f, "rita@gmail.com", "12345665");
	
		 
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 System.out.println("______________________");
		 System.out.println(s1.toString());
		 System.out.println(s2.toString());
		 System.out.println(s3.toString());
		 System.out.println("______________________");
		
	}

}
