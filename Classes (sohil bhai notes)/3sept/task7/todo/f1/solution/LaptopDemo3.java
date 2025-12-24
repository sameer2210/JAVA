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
 public class LaptopDemo3 {

	public static void main(String args[])throws Exception{
	
		Laptop l1  =new Laptop();
		
		
		System.out.println("_________________________________");
		
		l1.setProcessorType("i7");
		l1.setTotalRam(8);
		l1.setTotalRom(16);
		l1.setOs("Window");
		
		System.out.println("_________________________________");
		Thread.sleep(1000);
		System.out.println( "processorType "  +  l1.getProcessorType());//i7
		Thread.sleep(1000);
		System.out.println( "Ram "  +  l1.getTotalRam());//8
		Thread.sleep(1000);
		System.out.println( "ROM "  +  l1.getTotalRom());//16
		Thread.sleep(1000);
		System.out.println( "os "  +  l1.getOs());//window
		
		
		
		l1.on();
		l1.off();
		
		
	}//end main

}//end class