public class SisStudentdemo{
	public static void main(String args[]){
	
	SisStudent s1 = new SisStudent();
	s1.setName(" sameer");
	s1.setAge(21);
	s1.setGender("male");
	s1.setMobile("+91 9691745454");
	s1.setEmail("sameermca@gmail.com");
	
	System.out.printf("NAME : %-15s\n",s1.getName());
	System.out.printf("AGE : %-4d\n",s1.getAge());
	System.out.printf("GENDER : %-8s\n",s1.getGender());
	System.out.printf("MOBILE : %-15s\n",s1.getMobile());
	System.out.printf("Email : %-50s\n",s1.getEmail());
	

	
	
	}//end main
}//end class