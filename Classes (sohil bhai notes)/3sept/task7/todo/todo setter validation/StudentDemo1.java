
public class StudentDemo1 {

	public static void main(String[] args) {
		
		SisStudent s1 = new SisStudent();
		s1.setName("Sumit");
		
		s1.setAge(19);  
		
		s1.setGender("others");  //male female Others
		s1.setMobile("+91 2345678905");//last 10 digit must be 10
		
		s1.setEmail("sur.nit.mca@gmail.com");
		
		System.out.printf("NAME : %-15s\n",s1.getName());
		System.out.printf("AGE : %-4d\n",s1.getAge());
		System.out.printf("GENDER : %-8s\n",s1.getGender());
		System.out.printf("MOBILE : %-15s\n",s1.getMobile());
		System.out.printf("EMAIL : %-50s\n",s1.getEmail());
		
		
	}
}
