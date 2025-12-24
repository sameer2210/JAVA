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

  //Date  25/10/2020
 public class SisCalc8 {

	public static void main(String args[]){
	
	String num1Str =null;
	String num2Str=null;
	int num1 =0;
	int num2 =0;
	int sum  =0;
	
	try{
			//get input
			num1Str  =args[0];  //"10"  ArrayIndexOutOfBoundsException
			num2Str  =args[1];//	"20" ArrayIndexOutOfBoundsException
			//parse it
			num1  = Integer.parseInt(num1Str);//NumberFormatException
			num2  = Integer.parseInt(num2Str);//NumberFormatException
			//process it
			sum  = num1  + num2;
			//print it 
			System.out.println(num1 + " + " + num2 + " =  " +sum);
			
	}catch(ArrayIndexOutOfBoundsException e){
	    //System.out.println("ERROR Message : " + e.getMessage()); //0 1
	    System.out.println("ERROR Message : must required 2 arguments");
	}catch(NumberFormatException e){
	   System.out.println("ERROR : both argument must be integer type");
	}catch(Exception e){
	  System.out.println("unknow Error "+ e.getMessage());
	}

	System.out.println("+++++++++++++++++++++++++++++++");
	System.out.println("Happy Ending ");
	System.out.println("+++++++++++++++++++++++++++++++");
	
	}//end main

}//end class