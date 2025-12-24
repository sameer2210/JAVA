public class SwDemoCase2 {

	public static void main(String[] args) {
		Software sw1 = new Software();
		Calculator calSw2 = new Calculator();
		MsPaint paintSw3 = new MsPaint();
		StickyNote stickSw4 = new StickyNote();
		
		System.out.println(sw1);
		System.out.println(calSw2);
		System.out.println(paintSw3);
		System.out.println(stickSw4);
		
		
	Software swRef  = null;
	System.out.println("swRef =  "+ swRef);
		
	swRef = sw1;
	System.out.println("swRef =  "+ swRef);
	swRef = calSw2;
	System.out.println("swRef =  "+ swRef);
		
	swRef = paintSw3;
	System.out.println("swRef =  "+ swRef);
	
	swRef = stickSw4;
	System.out.println("swRef =  "+ swRef);
	
		
//any super ref can point same type or any subtype		
	}

}
