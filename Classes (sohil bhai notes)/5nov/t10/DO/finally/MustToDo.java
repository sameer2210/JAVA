public class MustToDo {
	public static void main(String args[]){
	
	java.util.Random rand = new java.util.Random();
	try{
		  System.out.println(" ToDoA1Stmt ");
		  System.out.println(" ToDoA2Stmt ");
		  boolean flag = rand.nextBoolean();
		  if(flag==true){ int a = 10/0;	}
		  System.out.println(" ToDoA3Stmt ");
		  System.out.println(" ToDoA4Stmt must be execute ");

	}catch(Exception e){
			System.out.println(" Error : " + e.getMessage());
	}
		System.out.println(" ____________________ " );
		System.out.println(" happy ending " );
		
	}//end main
}//end class