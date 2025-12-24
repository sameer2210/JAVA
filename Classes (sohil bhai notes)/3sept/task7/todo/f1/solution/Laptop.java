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
 public class Laptop{ 
	private int totalRam;
	private int totalRom;
	private String os;
	private String processorType;
	
	public int getTotalRam(){	
		return totalRam;
	}
	public void setTotalRam(int totalRam){
		this.totalRam=totalRam;
	}
	
	public int getTotalRom(){	
	return totalRom;
	}
	
	public void setTotalRom(int totalRom){
			this.totalRom=totalRom;
	}
	
	public String getOs(){
		return os;
	}
	public void setOs(String os){
		this.os= os;
	}
	public String getProcessorType(){	
		return processorType;
	}
	public void  setProcessorType(String processorType){
		this.processorType=processorType;
	}
	
	
	void on(){
	 System.out.println(this +"   is On()");
	}
	
	void off(){
	 System.out.println(this +"   is Off() ");
	 
	}
 }//End of class 
