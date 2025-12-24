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

  //Date  25/08/2020
 public class SpecialReq {

	public static void main(String args[]){
	//output ABCD
	String str=new String ("ADCB");
	System.out.println("str = " + str);
	System.out.println("str.length() = " + str.length());
	//Step1 
	char []charArr = str.toCharArray();   //char[] toCharArray();
	System.out.println("charArr" + charArr);
	System.out.println("charArr" + java.util.Arrays.toString(charArr));
	System.out.println("charArr.length=" + charArr.length);
	//STEP2 sort
	java.util.Arrays.sort(charArr);
	System.out.println("after sort charArr" + java.util.Arrays.toString(charArr));
	//Step3 convet char[] to String 
	  
	 String str2  =  new String(charArr);
	System.out.println("str2 = " + str2);
	  
	}//end main

}//end class