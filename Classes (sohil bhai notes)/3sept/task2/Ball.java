public class Ball{
	boolean isMoving;
	boolean isRolling;
	
	void bounce(int force){
			System.out.println("ball starting boncing with force " + force);
			int totalBounce = force/10;
			for(int b=1;b<=totalBounce;b++){
				isMoving=true;
				System.out.println("bouncing#" +b);
						try{
							Thread.sleep(5000);
							}catch(Exception e){		}
					isMoving=false;
					show();
			}//end loop
	}
	
	void show(){
			System.out.println("ball status***is moving" + isMoving +" is rolling " + isRolling);
	}
		
	void roll(String direction,int force){
			System.out.println("ball starting rolling with force " + force +" and direction " + direction);
	
			int totalFeet = force/10;
			for(int f=1;f<=totalFeet;f++){
				isMoving=true;
				isRolling=true;
				System.out.println("moved"+f+" feet and rolled");
				try {
						Thread.sleep(1000);
				 } catch(Exception e){}
				show();
			}//end loop
			
			isMoving=false;
			isRolling=false;
			show();
		}
		
}//end class