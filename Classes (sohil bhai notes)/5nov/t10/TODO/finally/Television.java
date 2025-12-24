
public class Television {
  String color;
  String brandName;
  String modelNumber;
  String size;//inch
  float price;
  String type;
  
  boolean isOn;//false
  int currentVolume;//0
  int currentChannel;//0
  
  
  void info(){
	  System.out.println("+++++++info++++++++++++");
	  System.out.println("color : "+ color);
	  System.out.println("brandName: " + brandName);
	  System.out.println("price : " + price);
	  System.out.println("size : " + size);
	  System.out.println("type : " + type);
	  System.out.println("modelNumber : " + modelNumber);
	  System.out.println("isOn : " + isOn);
	  System.out.println("currentVolume : " + currentVolume);
	  System.out.println("currentChannel : " + currentChannel);
  }
  
  void on(){
	  if(isOn==false){
		  isOn=true;
		  System.out.println("tv on****");
	  }else{
		  System.out.println("tv already on****");
		  
	  }
	  
  }
  
  void off(){
	  if(isOn==true){
	   isOn=false;
	  System.out.println("tv off*********");
	  }else{
		  System.out.println("tv already off***");
		  
	  }
  }
  
  void volumeUp(){
	  System.out.println("++ val old val "+ currentVolume  +"  new "+ ++currentVolume);
  }
  void volumeDown(){
	  System.out.println("-- val old val "+ currentVolume  +"  new "+ --currentVolume);
  }
  void channelUp(){
	  System.out.println("++ channel old channel "+ currentChannel  +"  new "+ ++currentChannel);
  }
  
  void channelDown(){
	  System.out.println("-- channel old channel "+ currentChannel  +"  new "+ --currentChannel);
  }
  void jumpChannel(int newChannel){
	  String str ="old channel "+currentChannel;
	  currentChannel=newChannel;
	  str   = str +" jump change channel "+ newChannel;
	  System.out.println(str);
  }
  
  
}

