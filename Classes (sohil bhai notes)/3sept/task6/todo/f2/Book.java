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

  //Date  06/09/2020
 public class Book{ 
	String name;
	int totalPage;
	float price;
	
	void info(){
	 System.out.println("_________________________________");
	 System.out.println(this +" info ");
	 System.out.println("name  " + name);
	 System.out.println("total page  " + totalPage);
	 System.out.println("price  " + price);
	 System.out.println("_________________________________");
	}
	
	void updateInfo(String name,int totalPage,float price){
	 System.out.println(this +" update called info ...........");
	   this.name  = name;
	   this.totalPage=  totalPage;
	   this.price =price;
	
	}
	
 }//End of class 
