
public class AllConversation {

	public static void main(String[] args) {
	  String valueStr=new String("100");
	   //#1 String to primitive
	  //CTE int value  = valueStr;
	  int valueInt  = Integer.parseInt(valueStr); //100
	  
	  //#2premitive to String 
	//CTE   String str2  = valueInt;
	  String str2  = String.valueOf(valueInt);	
		
	  System.out.println("______________________");
	  //#3 primitveto object
	  int a  =1000;
	  Integer iObj1  = new Integer(a);
	  
	  //#4 String to object
	  String strV2=new String("2222");
	  Integer iObj2  = new Integer(strV2);
	  
	  System.out.println("____________Object ot primitive");
	  //#5 object to primitive
	  Integer iObj3  = new Integer(10000);
	  int iii = iObj3.intValue();
	  float fff  = iObj1.floatValue();
	  
	  //#6 
	  //Object ot String 
	  Integer iObj4  = new Integer(10000);
	  //CTE String tempStr  = iObj4;
	  String tempStr  = iObj4.toString();
	  
	  
	  
	}

}
