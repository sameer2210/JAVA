
public class Case2 {

	public static void main(String[] args) {
	  int a =10;  //primitive no methods
	  
	  //object has  method s
	  Integer iOb  = new Integer(a);
	  /* CTE 
	  byte b  = a;
	  String s  =a;
	  */
	  byte b  = iOb.byteValue();
	  short st = iOb.shortValue();
	  float ff = iOb.floatValue();
	  long ll  = iOb.longValue();
	  double dd  = iOb.doubleValue();
	  String s  =iOb.toString();
	  
	  
	}

}
