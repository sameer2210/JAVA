
public class MobileV2 {
 String brandName;
 String color; 
 String modelNumber;
 String os;
 float  screenSize; 
 float  price; 
 int    ram;
 int    rom;
 String coverColor;

 public MobileV2(String brandName, String color, String modelNumber) {
		this.brandName = brandName;
		this.color = color;
		this.modelNumber = modelNumber;
		System.out.println(this  +" created. with 3 args");
		}
 
 
 public MobileV2(String brandName, String color, String modelNumber, String os,
			float screenSize) {
	   	this(brandName,color,modelNumber);
	   	
		this.os = os;
		this.screenSize = screenSize;
		System.out.println(this  +" created. with 5 args");
		}
 
 public MobileV2(String brandName, String color, String modelNumber, String os,
		float screenSize, float price, int ram, int rom) {
	 this(brandName,color,modelNumber,os,screenSize);
	//called another constructor 
	this.price = price;
	this.ram = ram;
	this.rom = rom;
	System.out.println(this  +" created. with 8 args");
}


 void show(){
	String msg =
			this +"[brandName=" + brandName + ", color=" + color
			+ "\n, modelNumber=" + modelNumber + ", os=" + os 
			+ "\n, screenSize="+ screenSize + ", price=" + price
			+ "\n, ram=" + ram + ", rom=" + rom
			+ "\n, coverColor=" + coverColor + "]";
	System.out.println(msg);
}
 
 
 
 	
	
}
