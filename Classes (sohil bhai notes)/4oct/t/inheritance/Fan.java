class Fan{
	
	final int MIN_SPEED = 0;
	final int MAX_SPEED = 5;
	static int speed;
	
	public Fan(){
		System.out.println(this +" called");
	}
	
	void maxSpeed(int speed){
		if(speed==MAX_SPEED){
			System.out.println(this+ " alread on maxSpeed");
		}else{
			speed++;
			System.out.println(this+ " now maxSpeed becomes "+speed);
		}
		if(speed>MAX_SPEED){
			System.out.println(this+ " you broked regulator");
		}
	}
	
	void minSpeed(int speed){
		if(speed==MIN_SPEED){
			System.out.println(this+ " alread on minSpeed");
		}else{
			speed--;
			System.out.println(this+ " now minSpeed becomes "+speed);
		}
		if(speed<MIN_SPEED){
			System.out.println(this+ " you broked regulator");
		}
	}
	
	
	
}