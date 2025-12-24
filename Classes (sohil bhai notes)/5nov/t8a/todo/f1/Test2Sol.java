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

  //Date  28/10/2020
 public class Test2Sol {

	public static void main(String args[]){
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
		String text  = "JAVA";
		System.out.println("text = " + text);
		System.out.println("enter pos for get char");
		int pos  = scan.nextInt();
		try{
		char ch = text.charAt(pos-1);
		System.out.println(pos +"pos   char  = " + ch);
		}catch(StringIndexOutOfBoundsException e){
		System.out.println("ERROR : no char in given position "+ pos);
		}catch(Exception e){
		 System.out.println("ERROR "+ e.getMessage());
		}
		
		
		
		
		
	  
	}//end main

}//end class