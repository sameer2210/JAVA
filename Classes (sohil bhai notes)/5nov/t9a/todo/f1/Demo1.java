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

  //Date  29/10/2020
 public class Demo1 {

	public static void main(String args[]){
	
		String [] arr ={ "career",null,"java",null,"nit","sis"};
		java.util.Random rand  = new java.util.Random();

		try{
		System.out.println("+++++++++++++++++++++++++");
		int pickIndex  = rand.nextInt(arr.length);
		String pickWord = arr[pickIndex];
		System.out.println(pickWord);
		System.out.println(pickWord.toUpperCase());
		System.out.println("+++++++++++++++++++++++++");
		}catch(NullPointerException e){
		  System.out.println("Error : "+e.getMessage());
		  System.out.println("Error : no word found");
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}//end main

}//end class