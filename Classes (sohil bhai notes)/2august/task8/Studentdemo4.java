public class Studentdemo4 {
	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	String [][] myStudents = null;
	System.out.println("how many batch required ");
	int totalBatch = Integer.parseInt(scan.nextLine());
	
	//create batch
	myStudents = new String[totalBatch][];
	System.out.println("total batch " + myStudents.length);
	
	//create diff size for each batch student
	for(int batch=1;batch<=myStudents.length;batch++){
	 System.out.println("enter total student size int this batch");
	  System.out.println("enter total student size int this batch");
		int totalStudent = Integer.parseInt(scan.nextLine());
		myStudents[batch-1] = new String [totalStudent];
	}
	System.out.println("_______________________________");
	
	//fill student names
	for(int batch=1;batch<=myStudents.length;batch++){
	System.out.println("batch# " +batch +" has total stu " + myStudents[batch-1].length);
		for(int stu=1;stu<= myStudents[batch-1].length;stu++){
		 System.out.println("enter# " + stu + " student name");
		  String name = scan.nextLine();
		   myStudents[batch-1][stu-1] = name;
		}
	}
	for(int batch=1;batch<=myStudents.length;batch++){
	 System.out.println("batch# "+ batch +"has total stu " + myStudents[batch-1].length);
	  for(int stu=1;stu<=myStudents[batch-1].length;stu++){
		String name = myStudents[batch-1][stu-1];
		 System.out.println(" # " +stu+ " = " +name);
	   }
	}

}
}
