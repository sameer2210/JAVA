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

  //Date  01/03/2020
 public class Case1 {

	public static void main(String args[]){
	//A-L
	  System.out.println("_________way1___________");
	  System.out.print("ABCDEFGHIJKL");
	  System.out.print("\n");
	  System.out.println("_________way2___________");
	  System.out.print("A");
	  System.out.print("B");
	  System.out.print("C");
	  System.out.print("D");
	  System.out.print("E");
	  System.out.print("F");
	  System.out.print("G");
	  System.out.print("H");
	  System.out.print("I");
	  System.out.print("J");
	  System.out.print("K");
	  System.out.print("L");
	  System.out.print("\n");
	  System.out.println("_________way3___________");
	  char ch='A';
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print("\n");
	  
	  System.out.println("_________way4___________");
	  char ch2='A';
		for(int print=1;print<=12;print++){
		System.out.print(ch2++);
		}
	  System.out.print("\n");
	  
	  System.out.println("_________way5___________");
	  
		for(int print='A';print<='L';print++){
			System.out.print((char)print);
		}
	  System.out.print("\n");
	  
	  System.out.println("_________way6___________");
	  int print='A';
		for(;  print<='L';  ){
			System.out.print((char)print);
			print++;
		}
	  System.out.print("\n");

	  System.out.println("_________way7___________");
	  int print1='A';
		while( print<='L'  ){
			System.out.print((char)print1);
			print1++;
		}
	  System.out.print("\n");

	  
	  
	  
	}//end main

}//end class