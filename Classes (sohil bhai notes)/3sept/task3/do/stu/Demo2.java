public class Demo2{
	public static void main(String args[]){
	
	WhiteBoard sisWhiteBoard =new WhiteBoard();
	
	Student s1 =new Student();
	Student s2 =new Student();
	Student s3 =new Student(); 
	s1.name="Sameer";
	s2.name="Shriram";
	s3.name="Ayaush";
	
	System.out.println("main sisWhiteBoard = " + sisWhiteBoard);
	sisWhiteBoard.showData();
	
	s1.addInfoInWhiteBoard(sisWhiteBoard);
	sisWhiteBoard.showData();
	
	s2.addInfoInWhiteBoard(sisWhiteBoard);
	sisWhiteBoard.showData();
	
	s3.addInfoInWhiteBoard(sisWhiteBoard);
	s3.addInfoInWhiteBoard(sisWhiteBoard);
	s3.addInfoInWhiteBoard(sisWhiteBoard);
	
	sisWhiteBoard.showData();
			
	
	}//end main
}//end class