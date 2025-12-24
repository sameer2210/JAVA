public class Human {
	String name;
	String gender;
	
	public Human(String name, String gender){
		this.name = name;
		this.gender = gender;
		System.out.println(" 2 arg human constructor called ");
	}
	
	void show(){
		System.out.println(this + " ______Human info ______");
		System.out.println("name " +name);
		System.out.println("gender "+gender);
	}
	
	
}//end calss