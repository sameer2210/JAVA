
public class FanRegulator {

	private int regulateValue=0;
	private Fan fan; 
	public void attached(Fan fan) {
		this.fan=fan;
	}
	public void disAttached() {
		this.fan=null;
	}
	
	
	public void regulate(){
		if(fan!=null){
			switch(regulateValue){
				case 0: fan.voltageSupply("0");break;
				case 1: fan.voltageSupply("1");break;
				case 2: fan.voltageSupply("m");break;
				case 3: fan.voltageSupply("h");break;
			}
		}else{
			System.out.println("No Fan attached "+fan);
		}
		
		System.out.println(regulateValue++);
		//clock wise logic  0 1 2 3 0 1 2 3
		
		if(regulateValue==4){
			regulateValue=0;
		}
		
	}

}
