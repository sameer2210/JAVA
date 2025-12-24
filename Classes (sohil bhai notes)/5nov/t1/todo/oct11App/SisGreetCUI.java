 //NIT Student Gagan
 public class SisGreetCUI extends SisGreet{ 
    
	public  void showMessage(){
	  String msg  = "welcome user "+ getUserName()+"\n";
	  msg  = msg+" today date is "+getFormatedDate();
	  System.out.println("________________________________");
	  System.out.println(msg);
	  System.out.println("________________________________");
	   
	  }
	
 }//End of class 
