import java.util.Date;

public class SpeDemo4 {
	public static void main(String args[]){
	
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1);
		System.out.println("___________________");
		SisDate sisD1 = new SisDate();
		System.out.println(sisD1);
		System.out.println(sisD1);
		System.out.println("____________________");
		
		Student s1 = new Student(1001," ramlal ","male",22,"nit","mca",3,98.9f,"ramlalDon@gmail.com","9879879879");
		System.out.println(s1);
		System.out.println(s1.toString());
		//Student@5c67e05
		System.out.println("____________________");
		
	
		}//end main
}//end class