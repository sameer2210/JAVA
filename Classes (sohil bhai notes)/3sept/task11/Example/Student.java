public class Student{
 
 private String name;
 private String gender;
 private float percentage;
 static int totalStudent;
 
 public Student(String name,String gender,float percentage){
	this.name = name;
	this.gender = gender;
	this.percentage = percentage;
	totalStudent++;
	System.out.println(this + "created # " + totalStudent);
 }
 
 void write(){
	System.out.println(name + " writing " + Math.random());
 }
 
 void aboutMe(){
	System.out.println("_________________________");
	System.out.println(this  + "details");
	System.out.println("my name is " + name);
	System.out.println("I am " + gender);
	System.out.println("& my percentage is " + percentage);
	System.out.println("___________________________");
 }
 
 static void whatIsStudent(){
	System.out.println("_________________________");
	System.out.println("Student ");
	System.out.println(" can read write ");
	System.out.println(" enhance knowledge");
	System.out.println("D*4.....");
	System.out.println("__________________________");
	System.out.println();
	
	}
	
}//end class
	
	
	
	
	
	
	
	
	
	
	
	
	
	