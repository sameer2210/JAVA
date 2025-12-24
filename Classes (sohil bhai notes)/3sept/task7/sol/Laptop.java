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
		this.os=os;
	}
	public String getProcessorType(){
		return processorType;
	}
	
	public void setProcessorType(String processorType){
		this.processorType=processorType;
	}
	
	void on(){
	 System.out.println(this + " is On()");
	}
	
	void off(){
	 System.out.println(this + " is Off()");
	}
	

}//end class
	 
	 
	 