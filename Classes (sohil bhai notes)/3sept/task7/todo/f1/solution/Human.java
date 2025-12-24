/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+12 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	@copyright  surendra 2020
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  08/09/2020
 public class Human{ 
	private String name;
	private int age;
	private String gender;
	private String color;
	private String bloodGroup;
	private String mobileNumber;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
	   //validate here if required
		this.name=  name;
	}
	
	public int getAge(){ 
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public String getGender(){ 
		return gender;
	}
	public void setGender(String gender){
	this.gender =gender;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	public String getBloodGroup(){
		return bloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup){
		this.bloodGroup=bloodGroup;
	}
	
	public String getMobileNumber(){
		return mobileNumber;
	}
	
	public void  setMobileNumber(String mobileNumber){
		this.mobileNumber =mobileNumber;
	}
	
	
	
	
	void eat(){
	  System.out.println(name +" eating ...." );
	 }
	void speak(){
	  System.out.println(name +" speak ...." );
	 }
	
	void showAll(){
		System.out.println("name   " + name);
		System.out.println("age   " + age);
		System.out.println("color   " + color);
		System.out.println("gender   " + gender);
		System.out.println("bloodGroup   " + bloodGroup);
		System.out.println("mobileNumber   " + mobileNumber);
		
	}
	
	
 }//End of class 
