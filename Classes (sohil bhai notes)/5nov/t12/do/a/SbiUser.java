public class SbiUser {

	String ac;
	String pin;
	float amount;
	boolean blocked;
	
	public SbiUser(String ac,String pin,float amount){
		super();
		this.ac = ac;
		this.pin = pin;
		this.amount = amount;
	}

	public SbiUser(String ac,String pin, float amount, boolean blocked){
		super();
		this.ac = ac;
		this.pin = pin;
		this.amount = amount ;
		this.blocked = blocked;
	}

		public String getAc(){
			return ac;
		}
		public void setAc(String ac){
			this.ac = ac;
		}
		public String getPin(){
			return pin;
		}
		public void setPin(String pin){
			this.pin = pin;
		}
		public float getAmount(){
			return amount;
		}
		public void setAmount(float amount){
			this.amount = amount;
		}	
	
		public void setBolcked(boolean blocked){
			this.blocked = blocked;
		}
	
		public boolean isBlocked(){
			return blocked;
		}

}//end class