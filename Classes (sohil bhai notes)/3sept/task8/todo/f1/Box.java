
public class Box {
	private float length; 
	private float breadth;
	private float height;
	private float price;
	private String brandName;
	private String color;
	private float weigth;
	
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
