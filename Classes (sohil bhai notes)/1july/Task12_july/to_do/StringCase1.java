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

  //Date  02/02/2020
 public class StringCase1 {

	public static void main(String args[]){
	
	  String s1="sis";
	  String s2="nit";
	  String s3="sis";
	  String s4="SIS";
	  String s5="s1;
	  System.out.println("s1 = " + s1);
	  System.out.println("s2 = " + s2);
	  System.out.println("s3 = " + s3);
	  System.out.println("s4 = " + s4);
	  System.out.println("s5 = " + s5);
	  
	  System.out.println("s1==s2 "  + (s1==s2));//F
	  System.out.println("s1==s3 "  + (s1==s3));//T
	  System.out.println("s1==s4 "  + (s1==s4));//F
	  System.out.println("s1==s5 "  + (s1==s5));//T
	  System.out.println("s1.equals(s2) =  "  + s1.equals(s2)   );//F
	  System.out.println("s1.equals(s3) =  "  + s1.equals(s3)  );//T
	  System.out.println("s1.equals(s4) =  "  + s1.equals(s4)  );//F
	  System.out.println("s1.equalsIgnoreCase(s4) =  "  + s1.equalsIgnoreCase(s4)  );//T
	  System.out.println("s1.equals(s5) =  "  + s1.equals(s5)  );//T
	  
	  System.out.println("__________________");
	  
	  String s11= new String("sis");
	  String s22= new String("nit");
	  String s33= new String("sis");
	  String s44= new String("SIS");
	  String s55 =  s11;
	  
	  System.out.println("s11 = " + s11);
	  System.out.println("s22= " + s22);
	  System.out.println("s33 = " + s33);
	  System.out.println("s44 = " + s44);
	  System.out.println("s55 = " + s55);
	  
	    System.out.println("s11==s22 "  + (s11==s22));//F
	  System.out.println("s11==s33 "  + (s11==s33));//F
	  System.out.println("s11==s44 "  + (s11==s44));//F
	  System.out.println("s11==s55 "  + (s11==s55));//T
	  
	  System.out.println("s11.equals(s22) =  "  + s11.equals(s22)   );//F
	  System.out.println("s11.equals(s33) =  "  + s11.equals(s33)  );//T
	  System.out.println("s11.equals(s44) =  "  + s11.equals(s44)  );//F
	  System.out.println("s11.equalsIgnoreCase(s44) =  "  + s11.equalsIgnoreCase(s44)  );//T
	  System.out.println("s11.equals(s55) =  "  + s11.equals(s55)  );//T
	  
	  
	  
	}//end main

}//end class