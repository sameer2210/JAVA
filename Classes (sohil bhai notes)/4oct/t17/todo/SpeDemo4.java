import java.util.Date;



public class SpeDemo4 {

	public static void main(String[] args) {
		 Date d1  = new Date();
		 System.out.println(d1);//Sat Oct 10 08:07:56 IST 2020
		 System.out.println(d1.toString());//Sat Oct 10 08:07:56 IST 2020
		 System.out.println("______________________");
		 SisDate sisD1  = new SisDate();
		 System.out.println(sisD1);//SisDate@70dea4e
		 System.out.println(sisD1.toString());//SisDate@70dea4e
		 System.out.println("______________________");
		 Student s1  = new Student(1001, "ramesh", "male", 22, "mca", "nit", 3, 88.8f, "r@gmail.com", "123456789");
		 System.out.println(s1);
		 System.out.println(s1.toString());
		//Student@5c647e05
		 System.out.println("______________________");
		
	}

}
