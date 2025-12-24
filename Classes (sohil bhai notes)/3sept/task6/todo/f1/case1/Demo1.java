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
 public class Demo1 {

	public static void main(String args[]){
	
	Mobile skMobile = new Mobile();
	skMobile.details();
		
	skMobile.brandName="MI";
	skMobile.color="blue";
	skMobile.operatingSystem="android";
	skMobile.totalRam=8;
	skMobile.cameraTotalMegaPixel=21;	
	skMobile.details();
	
	System.out.println("_____________________");
	
	Mobile stuMobile = new Mobile();
	stuMobile.details();
	stuMobile.brandName="Vivo";
	stuMobile.color="blue";
	stuMobile.operatingSystem="android";
	stuMobile.totalRam=4;
	stuMobile.cameraTotalMegaPixel=48;	
	stuMobile.details();
	  
	}//end main

}//end class