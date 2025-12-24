public class Studentdemo {
	public static void main(String args[]){
	
	String [][] batchWiseNames = null;
	System.out.println(batchWiseNames);
	
	batchWiseNames = new String [3][3];
	System.out.println(batchWiseNames);
	System.out.println("total batch " + batchWiseNames.length);
	System.out.println("batch1 = " + batchWiseNames[0]);
	System.out.println("batch2 = " + batchWiseNames[1]);
	System.out.println("batch3 = " + batchWiseNames[2]);
	
	System.out.println("batch1 total student = " + batchWiseNames[0].length);
	System.out.println("batch2 total student = " + batchWiseNames[1].length);
	System.out.println("batch3 total student = " + batchWiseNames[2].length);
	
	System.out.println("batch1 1student name = " + batchWiseNames[0][0]);
	System.out.println("batch1 2student name = " + batchWiseNames[0][1]);
	System.out.println("batch1 3student name = " + batchWiseNames[0][2]);
	
	System.out.println("batch2 1student name = " + batchWiseNames[1][0]);
	System.out.println("batch2 2student name = " + batchWiseNames[1][1]);
	System.out.println("batch2 3student name = " + batchWiseNames[1][2]);
	
	System.out.println("batch3 1student name = " + batchWiseNames[2][0]);
	System.out.println("batch3 2student name = " + batchWiseNames[2][1]);
	System.out.println("batch3 3student name = " + batchWiseNames[2][2]);
	
	batchWiseNames[0][0] = "jhetalal";
	batchWiseNames[0][1] = "tarak";	
	batchWiseNames[0][2] = "champaklal";	
	
	batchWiseNames[1][0] = "tappu";
	batchWiseNames[1][1] = "sonu";
	batchWiseNames[1][2] = "goli";

	batchWiseNames[2][0] = "daya";
	batchWiseNames[2][1] = "anjali";
	batchWiseNames[2][2] = "babita";
	
	System.out.println("________________________________________\n");
	
	System.out.println("batch1 1student name = " + batchWiseNames[0][0]);
	System.out.println("batch1 2student name = " + batchWiseNames[0][1]);
	System.out.println("batch1 3student name = " + batchWiseNames[0][2]);
	
	System.out.println("batch2 1student name = " + batchWiseNames[1][0]);
	System.out.println("batch2 2student name = " + batchWiseNames[1][1]);
	System.out.println("batch2 3student name = " + batchWiseNames[1][2]);
	
	System.out.println("batch3 1student name = " + batchWiseNames[2][0]);
	System.out.println("batch3 2student name = " + batchWiseNames[2][1]);
	System.out.println("batch3 3student name = " + batchWiseNames[2][2]);
	

}
}
