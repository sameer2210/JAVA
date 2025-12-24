public class Television {

	String color;
	String brandName;
	String modelNumber;
	String size;		//inch
	float price;
	String type;
	
	boolean isOn;		//flase
	int currentVolume;	//0
	int currentChannel;	//0
	
	void info(){
			System.out.println("__________info___________");
			System.out.println("color : " + color);		
			System.out.println("brand Name : " + brandName);
			System.out.println("price : " + price );
			System.out.println("size : " + size );		
			System.out.println("type : " + type );
			System.out.println("Model Number : " + modelNumber );
			System.out.println("is On : " + isOn );
			System.out.println("currentVolume : " + currentVolume );
			System.out.println("currentChannel : " + currentChannel );
			System.out.println("_______________");
	}		
	
	void on(){
		if(isOn==false){
			isOn = true;
			System.out.println(" tv  On***** ");
		}else{
			System.out.println(" tv  already On**** " );
		}
	}//void
	
	void off(){
			if(isOn==true){
				isOn=false;
				System.out.println(" tv  Off**** ");
			}else{
				System.out.println(" tv already Off**** ");
			}
	}//void
	
	void volumeUp(){
		System.out.println(" ++val old val "+ currentVolume + " new " + ++currentVolume);
	}
	void volumeDown(){
		System.out.println(" --val old val "+ currentVolume + " new " + --currentVolume);
	}
	void channelUp(){
			System.out.println(" ++ channel old channel " + currentChannel + " new " + ++currentChannel );
	}
	void channelDown(){
			System.out.println(" -- channel old channel " + currentChannel + " new " + --currentChannel );
	}
	
	void jumpChannel(int newChannel){
			String str = " old channel " + currentChannel;
			currentChannel = newChannel;
			str  = str + " jump change channel " + newChannel;
			System.out.println(str);
	}
	
}//end class