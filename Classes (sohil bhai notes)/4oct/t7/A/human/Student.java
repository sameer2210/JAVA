
public class Student extends Human{
	String college;
	String branch;

	public Student(String name, String gender, String college, String branch){
			super(name,gender);
			this.college=college;
			this.branch=branch;
			System.out.println(" 4 arg student constructor called ");
	}
	
	void show(){
		System.out.println(this + "____Student info ______");
		System.out.println("name " + name);
		System.out.println("gender "+ gender);
		System.out.println("college "+ college);
		System.out.println("branch "+ branch);
	}
	
	
}//end class