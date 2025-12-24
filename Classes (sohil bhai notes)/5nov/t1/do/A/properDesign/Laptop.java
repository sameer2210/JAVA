public class Laptop {
	
	private String os;
	private int totalRam;
	private int totalHardDisk;
	public void on(){System.out.println(this + " on ");}
	public void off(){System.out.println(this + " off ");}
	
	public void installOs(){
		os = " windows 11 ";
		// linux doc nuix mac
	}
	public void installRam(){
			totalRam=4;
	}
	public void setHarDisk(){
		totalHardDisk=1;
	}
	
	
	void showDetails(){
		System.out.println(this + " os = "+os + " Ram = "+totalRam +" Hd = "+totalHardDisk);
		
	}

}//end class	