public class Mobile extends Device{
	
	void on(){
		System.out.println("Samsung...****");
		super.on();
		try{
		Thread.sleep(2000);
		}catch(InterruptedException e){
			e.getMessage();
		}
	}
	
	void off(){
		System.out.println("Off........");
		super.off();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.getMessage();
		}
	}
	
	void mobile(String brand){
		System.out.println("you have this mobile = " + this);
	}
	void mobile(int weight){
		System.out.println(" your mobile weight is = " + weight);
	}
	void mobile(long battery){
		System.out.println("in your mobile battery is = " + battery);
	}
		
	void mobile(float price){
		System.out.println(" your mobile price is = " + price);
	}
	
	void mobile(boolean buy){
		System.out.println(" do you want to buy or not = " + buy);
	}
	
}