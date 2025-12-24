public class Studentdemo2 {
	public static void main(String args[]){
	
	//fix
	String [][] batchWiseNames = null;
	
	//batchWiseNames = new String [3][3];
	batchWiseNames = new String [3] [];
	
	batchWiseNames[0] = new String [3];
	batchWiseNames[1] = new String [3];
	batchWiseNames[2] = new String [3];
	
	batchWiseNames[0][0] ="jhethalal";
	batchWiseNames[0][1] ="champaklal";
	batchWiseNames[0][2] ="jaintilal";
	
   	batchWiseNames[1][0] ="daya";
	batchWiseNames[1][1] ="babita";
	batchWiseNames[1][2] ="anjali";
	
	batchWiseNames[2][0] ="tappu";
	batchWiseNames[2][1] ="sonu";
	batchWiseNames[2][2] ="goli";	

	for(int batch=1;batch<=batchWiseNames.length;batch++){
	 int totalStudent = batchWiseNames[batch-1].length;
	System.out.println("batch#" +batch +"has total student " + totalStudent);
		for(int stu=1;stu<=totalStudent;stu++){
		  String name = batchWiseNames[batch-1][stu-1];
		  System.out.println("\t stu# " +stu + " name = " + name);
		}
		System.out.println("_______________________________");
	}
	System.out.println("_______________________________________");
	
	for(int batch=1;batch<=batchWiseNames.length;batch++){
	 int totalStudent = batchWiseNames[batch-1].length;
	  for(int stu=1;stu<=totalStudent;stu++){
		String name = batchWiseNames[batch-1][stu-1];
		 System.out.printf("%-15s ",name);
	   }
		System.out.println();
	}

}
}
