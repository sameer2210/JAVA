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

  //Date  08/09/2020
 public class LaptopDemo2 {

	public static void main(String args[]){
	
		Laptop l1  =new Laptop();
		
		
		System.out.println( "processorType "  +  l1.processorType);//null
		System.out.println( "Ram "  +  l1.totalRam);//0
		System.out.println( "ROM "  +  l1.totalRom);//0
		System.out.println( "os "  +  l1.os);//NULL
		
		System.out.println("_________________________________");
		
				l1.processorType="i7";
				l1.totalRam=8;
				l1.totalRom=16;
				l1.os="Window";
		
		System.out.println("_________________________________");
		System.out.println( "processorType "  +  l1.processorType);//i7
		System.out.println( "Ram "  +  l1.totalRam);//8
		System.out.println( "ROM "  +  l1.totalRom);//16
		System.out.println( "os "  +  l1.os);//window
		
		
		
		l1.on();
		l1.off();
		
		
	}//end main

}//end class