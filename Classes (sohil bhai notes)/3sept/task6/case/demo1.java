public class demo1{
	public static void main(String args[]){
	 
	Mobile skMobile = new Mobile();
	skMobile.details();
	
	skMobile.brandName="Oneplus";
	skMobile.color="Black";
	skMobile.operatingSystem="android";
	skMobile.totalRam=8;
	skMobile.totalRom=128;
	skMobile.cameraTotalMegaPixel=48;
	skMobile.details();
	
	System.out.println("________________________");
	
	Mobile stuMobile = new Mobile();
	stuMobile.details();
	stuMobile.brandName="OnePlus";
	stuMobile.color="black";
	stuMobile.operatingSystem="android";
	stuMobile.totalRam=8;
	stuMobile.totalRom=128;
	stuMobile.cameraTotalMegaPixel=48;
	stuMobile.details();
	
	
	}//end main
}//end class