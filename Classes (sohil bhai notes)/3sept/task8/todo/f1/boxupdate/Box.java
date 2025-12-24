
public class Box {
	private float length; 
	private float breadth;
	private float height;
	private float price;
	private String brandName;
	private String color;
	private float weigth;

 // public Box(); pushed by compiler if you don't push
  public Box(){
   this.length=10.0F;
   this.breadth=20.0F;
   this.height=30.0F;
   this.weigth=100f;
   this.color ="yellow";
    System.out.println(this +" constructor called and object created.........");
  }
 //over load constructor 
 public Box(String color){
   this.length=10.0F;
   this.breadth=20.0F;
   this.height=30.0F;
   this.weigth=100f;
   this.color =color;
    System.out.println(this +"1 arg constructor called and object created.........");
  }
 
 
 public Box(float length, float breadth,float height,float weigth, String color){
   this.length=length;
   this.breadth=breadth;
   this.height=height;
   this.weigth=weigth;
   this.color =color;
    System.out.println(this +" 5 arg constructor called and object created.........");
  }
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public float getWeigth() {
		return weigth;
	}
	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}
	


	void open(){
		System.out.println(this  +" opened");
	}

	void close(){
		System.out.println(this  +" closed");
	}


	void moved(){
		System.out.println(this  +" moved");
	}
	public void showDetails() {
	String info=  	this +"[length=" + length 
		 	+ ", breadth=" + breadth 
		 	+ "\n, height=" + height 
		 	+ ", price=" + price 
		 	+ ", brandName=" + brandName
		 	+ ", color=" + color
			+ "\n, weigth=" + weigth + "]";
	System.out.println("+++++++++++++++++++++++");
	System.out.println(info);
	System.out.println("+++++++++++++++++++++++");
	}
 
	 
	
	
}
