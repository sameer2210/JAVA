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

  //Date  31/08/2020
 public class PersonDemo3 {

	public static void main(String args[])throws Exception{
	
	Person myStudent  = new Person();
	
	myStudent.name="Ankita";
	myStudent.gender="Female";
	myStudent.age=22;
	Thread.sleep(2000);
	myStudent.aboutMySelf();
	Thread.sleep(2000);
	
	int givenNumber = myStudent.giveNumber() ;
	System.out.println("given number is " + givenNumber);
	
	Thread.sleep(2000);
	int []givenNumberSet = null;
	System.out.println("Given number set " + givenNumberSet);
	givenNumberSet = myStudent.generateNumbers(5);
	for(int p=1;p<=givenNumberSet.length;p++){
	     System.out.println("sno#"+p  +" "  +givenNumberSet[p-1]);
	}
	
	
	
	
	
	
	}//end main

}//end class