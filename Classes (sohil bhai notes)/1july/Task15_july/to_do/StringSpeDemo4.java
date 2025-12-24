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

  //Date  23/02/2020
 public class StringSpeDemo4{

	public static void main(String args[]){
		 java.util.Scanner scan  = new java.util.Scanner(System.in);
		 
		 
	String about="Author:Surendra Kumar Sao \n"+	
	">>Software Architectand Corporate Trainer	\n"+
	">>+11 year exp in (mumbai,pune,hyd,bangaluru)\n"+
	">>Java Certified SCJP & SCWCD with 98%\n"+
	">>Trained more than 5k students and employees.\n"+
    ">>MCA from (NIT)National Institute of Technology Raipur(C.G.)\n"+
	">>Email : sur.nit.mca@gmail.com\n"+
	">>Mobile 7987234544, 9009442844\n";
	System.out.println(about);
	System.out.println("________________________________");
		 System.out.println("what text do you want to find ? enter it");
		 String searchText  = scan.nextLine();
	System.out.println("________________________________");
	if(about.contains(searchText)){
	  System.out.println("found ");
	}else{
	  System.out.println("NOT found ");
	}
	
	System.out.println("_____________IgnoreCase___________________");
	if(about.toLowerCase().contains(searchText.toLowerCase())){
	  System.out.println("found ");
	}else{
	  System.out.println("NOT found ");
	}
	
	
	}//end main

}//end class