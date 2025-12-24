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
	
	//void update(String a,String b,String c,int d, int e){
	
	void update(String bn,String c,String o,int r, int m){
	  System.out.println("****update start...");
		brandName=bn;
		color=c;
		operatingSystem=o;
		totalRam=r;
		cameraTotalMegaPixel=m;	
	  System.out.println("***update done...");
	 
	}
	
	//void update(String bn,String c,String o,int r, int m){
	void update2(String brandName,String color,String operatingSystem,int totalRam, int cameraTotalMegaPixel){
	  System.out.println("****update2 start...");
		this.brandName=brandName;//bn;
		this.color=color; //c;
		this.operatingSystem=operatingSystem;//o;
		this.totalRam=totalRam;
		this.cameraTotalMegaPixel=cameraTotalMegaPixel; //m;	
	  System.out.println("***update2 done...");
	 
	}
	
	
 }//End of class 
