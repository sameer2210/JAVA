public class Trainer extends Student {

	public void teach() {
		System.out.println(this + " teaching T ");
	}
	public void motivate() {
		System.out.println(this + " motivating T ");
	}
	
//again override student 
	void speak() {
		System.out.println(this + " ---- speaking stu + professionally + real + casestudy + implmentaion + repuirment + usecase....");
	}
	
//again override student
	public void read() {
		System.out.println(this + " ---- read as professional way T>S " );
	}
	
//again override Student 
	public void write() {
		System.out.println(this + " ---- write as professional way T>S ");
	}
//again overrde student 
	void eat (){
		System.out.println(this + " --- Eat. professional way T>H ");
	}
	
	
}//end class