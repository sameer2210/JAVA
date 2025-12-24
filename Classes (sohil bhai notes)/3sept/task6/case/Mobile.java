public class Mobile{
	
	String brandName;
	String color;
	String operatingSystem;
	int totalRam;
	int totalRom;
	int cameraTotalMegaPixel;

	void details(){
	 System.out.println("__________________________");
	 System.out.println("brand : " + brandName);
	 System.out.println("color : " + color);
	 System.out.println("Os : " + operatingSystem);
	 System.out.println("Ram : " + totalRam);
	 System.out.println("Rom : " + totalRom);
	 System.out.println("camera mp : " + cameraTotalMegaPixel);
	}
	
	// void updata (String a,String b,String c,int d,int e){
	
	void update(String bn,String c,String o,int ra,int ro,int m){
	 System.out.println("******update start.....");
		brandName=bn;
		color=c;
		operatingSystem=o;
		totalRam=ra;
		totalRom=ro;
		cameraTotalMegaPixel=m;
	 System.out.println("*****update done.....");
	}
	
	//void update(String bn,String c,String o,int r,int r,int m){
	
	void update2(String brandName,String color,String operatingSystem,int totalRam,int totalRom,int cameraTotalMegaPixel){
	 System.out.println("*****update2 start.....");
		this.brandName=brandName;
		this.color=color;
		this.operatingSystem=operatingSystem;
		this.totalRam=totalRam;
		this.totalRom=totalRom;
		this.cameraTotalMegaPixel=cameraTotalMegaPixel;
	 System.out.println("****update2 done.....");
	}
	
		
	
}//end class