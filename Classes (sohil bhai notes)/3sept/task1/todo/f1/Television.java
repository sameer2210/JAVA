/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+11 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  01/09/2020
 public class Television{ 
  String brandName;
  float price;
  String type;
  String size;
  String modelNumber;
  
  boolean isOn;//false
  int currentVolume;//change 0-100 bw
  final int MIN_VOLUME = 0;//can not change
  final int MAX_VOLUME=100;//can not change
  
  int currentChannel;//0    can be 0-1000
  final int MIN_CHANNEL = 0;//can not change
  final int MAX_CHANNEL=1000;//can not change
  
  
  
  
  void showDetails(){
  System.out.println("------------------details-----------------");
     System.out.println("brand name " +brandName);
	 System.out.println("price  " + price);
	 System.out.println("type  " + type);
	 System.out.println("size  " + size);
	 System.out.println("Model Number  " + modelNumber);
	 System.out.println("Is Tv On " + isOn);
	 System.out.println("currentVolume " + currentVolume);
	 System.out.println("currentChannel " + currentChannel);
    System.out.println("_______________________________");  
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
     System.out.println("Tv is Already OFF *****");
	    
	 }
  
  }
  
  
  //vo
  void increaseVolume(){
     if(currentVolume==MAX_VOLUME){
	  System.out.println("alread volume is max*******");
	 }else{
	 System.out.print("vol++  old[" +currentVolume+"]");
     currentVolume++ ;
     System.out.print("new[" +currentVolume+"]\n");
	 }
  }
  void decreaseVolume(){
	  if(currentVolume>MIN_VOLUME){
		 System.out.print("vol--  old[" +currentVolume+"]");
		 currentVolume-- ;
		 System.out.print("new[" +currentVolume+"]\n");
	 }else{
	  System.out.println("alread volume is MIN*******");
	  
	 }
  }
  
  void channelUp(){
		//<100
      if(currentChannel<MAX_CHANNEL){
		   System.out.print("channel++ old[" +currentChannel+"]");
    	currentChannel++;
		 System.out.print("new[" +currentChannel+"]\n");
		
	  }else{
	    System.out.println("can not change channel max***"+MAX_CHANNEL);
		//currentChannel=0; 
	  }
	}
  
  
  void channelDown(){
		//<100
      if(currentChannel>MIN_CHANNEL){
	    System.out.print("channel--  old[" +currentChannel+"]");
    	currentChannel--;
		 System.out.print("new[" +currentChannel+"]\n");
	  }else{
	    System.out.println("can not change channel MIN**** "+MIN_CHANNEL);
		//currentChannel=0; 
	  }
	  
  }
  
  void jumpChannel(int newJumpChannelNumber){
     //if in a range change it else give error 
     if(newJumpChannelNumber>=MIN_CHANNEL
	     && newJumpChannelNumber<=MAX_CHANNEL){
		  System.out.println("old channel "+currentChannel +" changed into " +newJumpChannelNumber);
		 
		 currentChannel = newJumpChannelNumber;
	}else{
	  System.out.println(" invalid input channel number "+newJumpChannelNumber+"***** must be in range[ " +MIN_CHANNEL +" - " +MAX_CHANNEL + "]");	 
	}
  
  }//end method
  
  
 }//End of class 
