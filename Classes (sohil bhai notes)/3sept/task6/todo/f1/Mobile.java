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
 public class Mobile{ 
	String brandName;
	String color;
	String operatingSystem;
	int  totalRam;
	int  cameraTotalMegaPixel;
	
	void details(){
	 System.out.println("_____________________");
	 System.out.println("brand :" + brandName);
	 System.out.println("color :" +color);
	 System.out.println("Os :" +operatingSystem);
	 System.out.println("Ram :" +totalRam);
	 System.out.println("camera mp :" +cameraTotalMegaPixel);
	}
	
	void update(String bn,String c,String o,int r, int m){
		brandName=bn;
		color=c;
		operatingSystem=o;
		totalRam=r;
		cameraTotalMegaPixel=m;	
	 
	}
	
	
	
 }//End of class 
