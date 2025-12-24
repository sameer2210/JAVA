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

  //Date  31/10/2020
 public class NITStudentUse5{

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	while(true){
		try{
		System.out.println("enter number");
		int num  = Integer.parseInt(scan.nextLine()); 
		boolean r  =SisUtil.isValidNumberMethod2(num);// //SIS
		System.out.println(num +"  is valid " +r);
		System.out.println("all is ok ");
		break;
 	 }catch(NumberFormatException e){
	   System.out.println("ERROR  :input is not int type " );
	 
 	 }catch(NumberRangeException e){
	   System.out.println("Range ERROR "+ e.getMessage());
 	 }catch(Exception e){
	  System.out.println("ERROR : " + e.getMessage());
	 }
	
}//end while	
	  
	  
	}//end main
}//end class