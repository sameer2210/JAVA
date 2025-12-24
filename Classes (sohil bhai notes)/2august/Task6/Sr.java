public class Sr {
	public static void main(String args[]){
/*	
	byte b =10;
	short s =122;
	int i =1000;
	long l =55446;
	float f =10.2F;
	double d= 61846.66;
	boolean bool = true;
	
*/	
	//byte b ="10";
	byte b = Byte.parseByte("10");
	short s = Short.parseShort("122");
	int i = Integer.parseInt("2999");
	long l = Long.parseLong("6666666");
	float f = Float.parseFloat("10.5");
	double d = Double.parseDouble("477777.55");
	boolean bool = Boolean.parseBoolean("true");
	

	System.out.println( "byte " + b);
	System.out.println( "Short " + s);
	System.out.println( "int " + i );
	System.out.println( "long "+ l);
	System.out.println( "float "+ f);
	System.out.println( "double "+ d);
	System.out.println( " boolean "+bool);
	

}
}
