public class Test2{
	public static void main(String [] args ) throws Exception {
	java.util.Scanner scan = new java.util.Scanner(System.in);
		
	System.out.println("are you robot ?/true/false");
	boolean isRobot =scan.nextBoolean();

	System.out.println("Loading........\12wait for few min. .....\12.....\12......\12.....");
	Thread.sleep(4*1000);

	System.out.println("Sending a 4-digit password to your command system");

	int a = (int)(Math.random()*10);
	int b = (int)(Math.random()*10);
	int c = (int)(Math.random()*10);
	int d = (int)(Math.random()*10);
              int pass = a*1000+b*100+c*10+d*1;

	Thread.sleep(3*1000);
	System.out.println("Command system = your password is  "+pass);
	System.out.println("______________!!! ");
	
	java.util.Scanner Scan=new java.util.Scanner (System.in);
	System.out.println("Enter your password......");
	int userPassword =scan.nextInt();

	Thread.sleep(4*1000);
	if(pass==userPassword){
	javax.swing.JOptionPane.showMessageDialog(null,"password matched");
	
	System.out.println("Hello Robbo ");
		if(isRobot){
			System.out.println("welcome to moon ");
		}	
	  System.out.println("now you are safe here ! (^~^)");

}else{
	javax.swing.JOptionPane.showMessageDialog(null,"password not matched\12try again");
}
	
}
}