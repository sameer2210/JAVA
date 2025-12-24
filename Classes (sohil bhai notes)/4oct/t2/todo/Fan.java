
public class Fan {
   // brand,name,price
	boolean isOn;
	
	private void on(){
		System.out.println(this  +" on ");
		isOn=true;
		rotate("N");
	}
	private void off(){
		System.out.println(this  +" stoped ");
		isOn=false;
		
	}
	public void voltageSupply(String speedType){
		//0 1 N M H
		switch (speedType) {
			case "0":off();break;
			case "1":on();break;
			case "n":rotate("Normal");break;
			case "m":rotate("Medium");break;
			case "h":rotate("high");break;
		}
		
	}
	private void  rotate(String speedType){
		System.out.println(this  +"  ratating....with " +speedType);
	}
}
