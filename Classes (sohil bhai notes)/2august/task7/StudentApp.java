public class StudentApp {
	public static void main(String args[]){

	int totalStudent = args.length;
	System.out.println("total Student "+ totalStudent);
	
	for(int stu=1;stu<=args.length;stu++){
	 String name = args[stu-1];
	  System.out.println("sno "+stu +" = "+name);
	}

}
}