class Regulator{
	
	Fan fan;
	
	public Regulator(){
		fan = new Fan();
	}
	
	void incraseSpeedByUser(int speedByUser){
		fan.maxSpeed(speedByUser);
	}
	void decreaseSpeedByUser(int speedByUser){
		fan.minSpeed(speedByUser);
	}
}