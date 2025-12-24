public class Mobile{
	
	String brandName;
	String color;
	String operatingSystem;
	int totalRam;
	int totalRom;
	int cameraTotalMegaPixel;
	
	void details(){
	 System.out.println("\n__________________________");
	 System.out.println("brand = " + brandName);
	 System.out.println("color = " + color);
	 System.out.println("Os = " + operatingSystem);
	 System.out.println("Ram = " + totalRam);
	 System.out.println("Rom = " + totalRom);
	 System.out.println("camera MP = " + cameraTotalMegaPixel);
	}
	
	void update(String bn,String c,String o,int ra,int ro,int m){
		brandName=bn;
		color=c;
		operatingSystem=o;
		totalRam=ra;
		totalRom=ro;
		cameraTotalMegaPixel=m;
	}
	
		
	
	
}//end class