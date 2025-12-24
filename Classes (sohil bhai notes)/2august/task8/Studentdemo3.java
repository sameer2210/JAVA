public class Studentdemo3 {
	public static void main(String args[]){
	
	//fix
	String [][] batchWiseNames = null;
	batchWiseNames = new String [2] [];
	
	batchWiseNames[0] = new String [4];
	batchWiseNames[1] = new String [6];
	
	
	batchWiseNames[0][0] ="Iron man";
	batchWiseNames[0][1] ="thor";
	batchWiseNames[0][2] ="hulk";
	batchWiseNames[0][3] ="captain america";
	
	batchWiseNames[1][0] = "docter strange";
	batchWiseNames[1][1] ="black panther";
	batchWiseNames[1][2] ="howk eye";
	batchWiseNames[1][3] ="black widow";
	batchWiseNames[1][4] ="spider man";
	batchWiseNames[1][5] ="ant man";	

	System.out.println("total batch " + batchWiseNames.length);
	 for(int batch=1;batch<=batchWiseNames.length;batch++){
	  int totalStudent = batchWiseNames[batch-1].length;
	  System.out.println("batch# " +batch +" has total student "+ totalStudent);
		for(int stu=1;stu<=totalStudent;stu++){
		 String name = batchWiseNames[batch-1][stu-1];
		  System.out.println("\t stu# " +stu + " name = " + name);
		}
		System.out.println("___________________________");
	 }
	System.out.println("___________________________________");
	
	for(int batch=1;batch<=batchWiseNames.length;batch++){
	 int totalStudent = batchWiseNames[batch-1].length;
		for(int stu=1;stu<=totalStudent;stu++){
		 String name = batchWiseNames[batch-1][stu-1];
		  System.out.printf("%-16s ",name);
		}
		System.out.println();
		System.out.println();
	}

}
}