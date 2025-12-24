public class Human{
	private String name;
	private String gender;
	private String color;
	private int age;
	private float height;

	void eat(){
	System.out.println("Eating...................................");
	}
	void speak(){
	System.out.println("Speaking................................");
	}
	void humInfo(){
	System.out.println("------------------------------------");
	System.out.println("Name : "+name);
	System.out.println("Gender : "+gender);
	System.out.println("Color : "+color);
	System.out.println("Age : "+age);
	System.out.println("Height :"+height);
	}

public void setName(String name){
	this.name=name;
}
public void setGender(String gender){
	this.gender=gender;
}

public void setColor(String color){
	this.color=color;
}
public void setAge(int age){
	this.age=age;
}
public void setHeight(float height){
	this.height=height;
}


	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public float getHeight(){
		return height;
	}
	public String getGender(){
		return gender;
	}
	public String getColor(){
		return color;
	}

}	
