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

  //Date  24/02/2020
 public class Output3 {

	public static void main(String args[]){
	
		System.out.println(true?100:200);
		System.out.println(!true?100:200);
		
		System.out.println(true?'A':66);//char part
		System.out.println(!true?'A':66);//char part
		System.out.println(!true?65:'B');//char part
		System.out.println(true?65:'B');//char part
		System.out.println("++++++++++++++++");
		System.out.println(true?"sis":"nit");//
		System.out.println(true?100:200);//100
		
		System.out.println(true?100:200.5);//100.0
	  //CTE String r1= 5>7?"100":200;
		System.out.println(5>7?"100":200);//"100"  "200"    = "200"
		System.out.println(5>7?"100":true);//"100"  "true"    = "true"
	}//end main

}//end class