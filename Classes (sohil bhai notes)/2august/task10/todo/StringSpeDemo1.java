/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+11 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  21/08/2020
 public class StringSpeDemo1 {

	public static void main(String args[]){
	
	String info= ">>Software Architect and Corporate Trainer \n"+
	">>+11 year exp in (mumbai,pune,hyd,bangaluru) \n"+
	">>Java Certified SCJP & SCWCD with 98% \n"+
	"Trained more than 5k students and employees. \n"+
    "MCA from (NIT)National Institute of Technology Raipur(C.G.) \n"+
	"Email : sur.nit.mca@gmail.com\n"+
	"Mobile 7987234544  , 9009442844 \n";
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println(info);
	  
	  System.out.println("enter text for search");
	  String searchText  = scan.nextLine();
	/*   if(info.equalsIgnoreCase(searchText)){
		System.out.println("found");
	  }else{
		System.out.println("NOT found");
	  } */
	  
	  
	   //if(info.contains(searchText)){
	   if((info.toLowerCase()).contains(searchText.toLowerCase())){
		System.out.println("found");
	  }else{
		System.out.println("NOT found");
	  } 
	}//end main

}//end class