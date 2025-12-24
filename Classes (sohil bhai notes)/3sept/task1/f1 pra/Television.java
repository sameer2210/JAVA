public class Television{ 
	String brandName;
	float price;
	String type;
	String size;
	String modelNumber;
	
	boolean isOn;
	int currentVolume;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME=100;
	
	int currentChannel;
	final int MIN_CHANNEL = 0;
	final int MAX_CHANNEL=1000;
	
	void showDetails(){
	System.out.println("________________details_________");
	System.out.println("brand name " +brandName);
		System.out.println("price " + price);
		System.out.println("type " + type);
		System.out.println("size " + size);
		System.out.println("model number " + modelNumber);
		System.out.println("Is tv On" + isOn);
		System.out.println("currentVolume " + currentVolume);
		System.out.println("currentChanel" + currentChannel);
	System.out.println("______________________________");
	}
	
	void on(){
	 if(isOn==false){
		isOn=true;
	  System.out.println("Tv is ON");
		}else{
		System.out.println("tv is already ON *********");
		}
	}
	
	void off(){
	 if(isOn==true){
		isOn=false;
		System.out.println("Tv is OFF");
			}else{
		System.out.println("Tv is Already OFF *********");
			}
	 }
	 
	 void increaseVolume(){
	  if(currentVolume==MAX_VOLUME){
		System.out.println("alread volume is max*********");
		}else{
		System.out.print("vol++ old[" +currentVolume+"]");
	 currentVolume++;
	 System.out.print("new[" +currentVolume+"]\n");
		}
	 }
	 void decreaseVolume(){
		if(currentVolume>MIN_VOLUME){
			System.out.print("vol-- old[" +currentVolume+"]");
			currentVolume--;
			System.out.print("new[" +currentVolume+"]\n");
		}else{
			System.out.println("alread volume is MIN*********");
		 }
		}
		
		void channelUp(){
		 if(currentChannel<MAX_CHANNEL){ 
			System.out.print("channel++ old[" +currentChannel+"]");
			currentChannel++;
				System.out.print("new[" +currentChannel+"]\n");
		  }else{
			System.out.println("can not change channel max***"+MAX_CHANNEL);
			}
		}
			
		void channelDown(){
		  if(currentChannel>MIN_CHANNEL){
			System.out.print("channel--	old[" +currentChannel+"]");
			currentChannel--;
				System.out.print("new[" +currentChannel+"]\n");
			}else{
				System.out.println("can not change channel MIN**** " +MIN_CHANNEL);
			}
		}
		
	void jumpChannel(int newJumpChannelNumber){
		if(newJumpChannelNumber>=MIN_CHANNEL
			&& newJumpChannelNumber<=MAX_CHANNEL){
				System.out.println("old channel " +currentChannel +" changed into " +newJumpChannelNumber);
				
				currentChannel = newJumpChannelNumber;
				}else{
					System.out.println(" invalid input channel number " +newJumpChannelNumber+ "****must be in range[" +MIN_CHANNEL +" - " +MAX_CHANNEL + "]");
				}

	
	}//end method
}//end class