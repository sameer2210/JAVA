
public class Trainer extends Student{

 	 public void teach() {
	 System.out.println(this  +" teaching  T");
	}
	 public void motivate() {
	System.out.println(this  +" motivating T");
	}	
	 
  //again override    Student 
	void speak(){ 
	System.out.println(this +" $$$$$$$$ speaking. stu+ professionally  + real + casestudy  +implmentation  + requirement +usecase...");
	}
	
	
  //again override    Student 
	public void read() {
	System.out.println(this  +"$$$$$$$ Read as professional way T>S");
	}	
	
  //again override    Student 
   public void write() {
	System.out.println(this  +"$$$$$$$ Write  as professional way T>S");
	 
	}	
	
  //again override    Human
	void eat(){ 
	System.out.println(this +"$$$$ Eat.. professional way T>H");
	}	
	
}
