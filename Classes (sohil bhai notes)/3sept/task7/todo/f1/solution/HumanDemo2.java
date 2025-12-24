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
 public class HumanDemo2{

	public static void main(String args[]){
	
		Human h1  = new Human();
			
		//update
		/*
		h1.name="Ramesh";		//h1.name="123";		//h1.name="#@$%";
		h1.age=22;//		h1.age=1022;//		h1.age=-22;
		h1.color="fair";//		h1.color="lime";		h1.color="green";
		h1.gender="male";//		h1.gender="female";	h1.gender="abcd";h1.gender="22";		
		h1.bloodGroup="ab";//		h1.bloodGroup="xyz";h1.bloodGroup="123";
		h1.mobileNumber="1234567890";//		h1.mobileNumber="zxcvbnm";		h1.mobileNumber="#4$####$#$";
		*/
		h1.setName("Ramesh");
		
		h1.setAge(22);
		
		h1.setColor("fair");
		
		h1.setGender("male");
		
		h1.setBloodGroup("ab");
		
		h1.setMobileNumber("1234567890");

		
		//fetch
		//h1.gender="female";
		System.out.println("__________________________________");
/*	Give Error : private data can not be direct access
	System.out.println("name   " + h1.name);
		System.out.println("age   " + h1.age);
		System.out.println("color   " + h1.color);
		System.out.println("gender   " + h1.gender);
		System.out.println("bloodGroup   " + h1.bloodGroup);
		System.out.println("mobileNumber   " + h1.mobileNumber);
	*/

	    System.out.println("name   " + h1.getName());
		System.out.println("age   " + h1.getAge());
		System.out.println("color   " + h1.getColor());
		System.out.println("gender   " + h1.getGender());
		System.out.println("bloodGroup   " + h1.getBloodGroup());
		System.out.println("mobileNumber   " + h1.getMobileNumber());	
	
	
		
		System.out.println("__________________________________");
		
		//h1.eat();
		//h1.speak();
		
		
	  
	}//end main

}//end class