public class Baby {
	private String name;
	private String gender;
	private int age;
	private String color;
	private String bloodGroup;
	private float weight;
	boolean fit;
	
	public Baby(String gender,int age,String color,String bloodGroup,float weight,boolean fit){
	this.gender=gender;
	this.age=age;
	this.color=color;
	this.bloodGroup=bloodGroup;
	this.weight=weight;
	this.fit=fit;
	System.out.println(this + " created with 6arg canstructor.....");
	}
	
	public void setFit(boolean fit){
	this.fit=fit;
	}
	public boolean isFit(){
	return fit;
	}
	
	public String getGender(){
	return gender;
	}
	public void setGender(String gender){
	this.gender = gender;
	}
	
	public void setName(String name){
	this.name = name;
	}
	public String getName(){
	return name;
	}
	
	public void setAge(int age){
	this.age = age;
	}
	public int getAge(){
	return age;
	}
	
	public void setColor(String color){
	this.color = color;
	}
	public String getColor(){
	return color;
	}
	
	
	public String getBloodGroup(){
	return color;
	}
	public void setBloodGroup(String bloodGroup){
	this.bloodGroup =bloodGroup;
	}
	
	public float getWeight(){
	return weight;
	}
	public void setWeight(float weight){
	this.weight = weight;
	}
	
	void cry(){
	System.out.println(this + " crying");
	}
	void smile(){
	System.out.println(this + "smiling");
	}
	void sleep(){
	System.out.println(this + "sleeping");
	}
	void allDetails(){
		System.out.println("_______"+this +"details________");
		System.out.println("name "+ name);
		System.out.println("age " + age + "month");
		int y = age/12;
		int m = age%12;
		System.out.println("age" + y + "year" + m + "month");
		System.out.println("gender " + gender);
		System.out.println("color " + color);
		System.out.println("BloodGroup" + bloodGroup);
		System.out.println("weight " + weight + "kg");
		System.out.println("fit" + fit);
		System.out.println("_________________________");
	}
	
}//end ssclass 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	