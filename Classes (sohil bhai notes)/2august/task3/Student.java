public class Student {
	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	//String []studentNames;
	System.out.println("how many student names required?");
	String [] studentNameList = new String[scan.nextInt()];
	System.out.println("total students "+studentNameList.length);
	
	for(int stu=1;stu<=studentNameList.length;stu++){
	 String name = studentNameList[stu-1];
		System.out.println("sno # " +stu +" name = " + name);
	}
	
	//fill values
	for(int stu=1;stu<=studentNameList.length;stu++){
		System.out.println("enter stu "+stu +" name ");
		String name = scan.next();
		studentNameList[stu-1] = name;
	}
	for(int stu=1;stu<=studentNameList.length;stu++){
	String name = studentNameList[stu-1];
		System.out.println("sno # "+stu +" name = " + name);
	}
}
}
