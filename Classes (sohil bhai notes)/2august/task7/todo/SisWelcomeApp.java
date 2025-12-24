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

  //Date  18/08/2020
  /*
  java SisWelcomeApp                  console
  java SisWelcomeApp cui             console
  java SisWelcomeApp gui              GUI
  java SisWelcomeApp both             cui and  GUI
  
  
  */
  
 public class SisWelcomeApp {

	public static void main(String args[]){
	
	String showOption  ="cui";
	
	if(args.length==1){
	     
		 String option = args[0];  //get input from command line
		 
		 if("gui".equals(option)){
			showOption ="gui";
		 }else if("both".equals(option)){	 
			showOption ="both";
		  } 
	}
	
	//logic
	String msg ="Welcome  To sis To all Engineers!";
	
	if("both".equals(showOption)){
		  System.out.println(msg);
		javax.swing.JOptionPane.showMessageDialog(null,msg);
	}else if("gui".equals(showOption)){
		javax.swing.JOptionPane.showMessageDialog(null,msg);
	 }else{
		  System.out.println(msg);
	 } 
	  
	  
	}//end main

}//end class