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

  //Date  04/10/2020
 public class WC1 {

	public static void main(String args[]){
	
	String s1= new String("java");
	String s2= new String("nit");
	String s3= new String("java");
	
	System.out.println(s1==s2);//F
	System.out.println(s1==s3);//F
	System.out.println(s1.equals(s2)); //false
	System.out.println(s1.equals(s3));//true
	System.out.println("__________________");
	Integer i1  = new Integer(1000);
	Integer i2  = new Integer(2000);
	Integer i3  = new Integer(1000);
	System.out.println("_______==___________");
	System.out.println(i1==i2);//false
	System.out.println(i1==i3);//false
	System.out.println("______ equals___________");
	System.out.println(i1.equals(i2));//false
	System.out.println(i1.equals(i3));//true
	System.out.println("__________ob.intValue_____________");
	System.out.println(i1.intValue()==i2.intValue());//false
	System.out.println(i1.intValue()==i3.intValue());//true
	//all wc has equals method
	
	  
	}//end main

}//end class