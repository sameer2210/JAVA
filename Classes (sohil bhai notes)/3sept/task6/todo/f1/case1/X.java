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

  //Date  06/09/2020
 public class X{ 
	int a;
	int b;
	int c;
	void show(){
	System.out.println("________________________");
	 System.out.printf("a=%3d b=%3d c=%3d \n",a,b,c);
	System.out.println("________________________");
	}
	
	void update1(int x, int y , int z){
	   System.out.println("update way1 called x,y,x "+x +","+y+","+z);
	   a=x; //	   this.a=x;
	   b=y;
	   c=z;
	}
	
	
	void update2(int x, int y , int c){
	   System.out.println("update way2 called x,y,c "+x +","+y+","+c);
	   a=x;//update object variable
	   b=y;////update object variable
	   c=c;//update local variable   self update
	}
	
	
	
	
	void update3(int a, int b , int c){
	   System.out.println("update way3 called a,b,c "+a +","+b+","+c);
	   a=a;//update local variable   self update   NOT INSTANCE VAR
	   b=b;////update local variable   self update NOT INSTANCE VAR
	   c=c;//update local variable   self update   NOT INSTANCE VAR
	}
	
	
	//corporate standard
	void update4(int a, int b , int c){
	   System.out.println("update way4 called a,b,c "+a +","+b+","+c);
	   this.a=a;//update INSTANCE VAR
	   this.b=b;////update INSTANCE VAR
	   this.c=c;//update [ INSTANCE VAR
	}
	
	
 }//End of class 
