
public class Person {
    Eye leftEye; 
    Eye rightEye;
    public Person() {
    	leftEye=new Eye();
    	rightEye=new Eye();
    	System.out.println( "left eye ref "+ leftEye);
    	System.out.println( "right eye ref "+ rightEye);
    	
	}
	public void blick() {
			System.out.println("blick");
		    leftEye.open();
			rightEye.open();
			System.out.println("blick");
			try {Thread.sleep(2000);} catch (Exception e) {}
			leftEye.close();
			rightEye.close();
			System.out.println("blick");
			try {Thread.sleep(2000);} catch (Exception e) {}
			leftEye.open();
			rightEye.open();
			try {Thread.sleep(2000);} catch (Exception e) {}
			System.out.println("blick");
			leftEye.close();
			rightEye.close();
			System.out.println();
			
			
			
		
	}
	public void wink() {
		System.out.println("_______________");
		System.out.println("wink");
		leftEye.close();
		rightEye.open();
		System.out.println("_______________");
		
	}
    
}
