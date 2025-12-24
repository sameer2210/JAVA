public class Demo{
	
	public static void main (String []args){
		
		Student s1 = new Student();
		
		s1.setId(2210);
		s1.setName("sameer");
		s1.setSchool("smcs");
		
		System.out.println("default = " + s1.getId());
		System.out.println("private = " +s1.getName());
		System.out.println("protected = " +s1.getSchool());
		
	}
	
}