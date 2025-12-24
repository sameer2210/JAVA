 public class Rdemo1{

	public static void main(String args[]){
	java.util.Date currentDateAndTime  = new java.util.Date();

	System.out.println(currentDateAndTime);
	System.out.println(Math.random());
	System.out.println((int)(Math.random()*100));
	int i =((int)(Math.random()*10))%2;
	boolean r = i==0?false:true;
	System.out.println(r);

System.out.println("______________________________________________");
	
	java.util.Random rand = new java.util.Random();
	//System.out.println("byte" + (byte)rand.nextInt());
	
	System.out.println("Int " + rand.nextInt());
	System.out.println("long "+ rand.nextLong());
	System.out.println("float "+rand.nextFloat());
	System.out.println("double "+rand.nextDouble());
	System.out.println("boolean "+ rand.nextBoolean());

System.out.println("_____________________________________________");

	//java.util.Random rand = new java.util.Random();

	System.out.println(rand.nextInt());
	System.out.println(rand.nextInt());
	System.out.println("+++++++++++++++++++++++++++++");
	System.out.println(rand.nextInt(2));
	System.out.println(rand.nextInt(10));
	System.out.println(rand.nextInt(6));
	System.out.println(rand.nextInt(6));
	System.out.println(rand.nextInt(26));
	System.out.println(rand.nextInt(100));	
	System.out.println(rand.nextInt(100) + 1);
	  
	
}
}

