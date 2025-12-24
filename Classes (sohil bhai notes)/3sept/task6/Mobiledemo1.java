public class Mobiledemo1{
	public static void main(String args[]){
	
	Mobile skMobile = new Mobile();
	skMobile.details();
	
	skMobile.brandName="Oneplus";
	skMobile.color="black";
	skMobile.operatingSystem="android";
	skMobile.totalRam=8;
	skMobile.totalRom=128;
	skMobile.cameraTotalMegaPixel=48;
	skMobile.details();
	
	System.out.println("\n________________________\n");
	
	Mobile stuMobile = new Mobile();
	
	stuMobile.brandName="Apple";
	stuMobile.color="black";
	stuMobile.operatingSystem="Ios14";
	stuMobile.totalRam=12;
	stuMobile.totalRom=512;
	stuMobile.cameraTotalMegaPixel=50;
	stuMobile.details();
	
		
	
	
	}//end main
}//end class