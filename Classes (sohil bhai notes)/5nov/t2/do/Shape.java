import java.util.prefs.BackingStoreException;

public abstract class Shape {
	protected String bgColor;
	protected String borderColor;
	
	public String getBgColor(){
		return bgColor;
	}
	public void setBgColor(String bgColor){
		this.bgColor = bgColor;
	}
	public String getBorderColor(){
		return borderColor;
	}
	public void setBorderColor(String borderColor){
		this.borderColor = borderColor;
	}
	
	public abstract void draw();
	public abstract void calculateArea();
	public void showDetails(){
		System.out.println(this + " bg color " +bgColor);
		System.out.println(this + " border color " + borderColor);
	}
	
}//end class
	
	
	