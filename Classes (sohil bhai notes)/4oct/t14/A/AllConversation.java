public class AllConversation {
	public static void main(String args[]){

		String valueStr = new String("100");
			//#1 String to primitive
			//CTE int value = valueStr;
			int valueInt = Integer.parseInt(valueStr);

			//#2 premitive to String 
			//CTE String str 2 = valueInt;
			String str = String .valueOf(valueInt);
			
			System.out.println("____________________");
			
			//#3 primitiveto object
			int a = 1000;
			Integer iObj1 = new Integer(a);
			
			//#4 String to object
			String strV2 = new String("2222");
			Integer iObj2 = new Integer(strV2);
			System.out.println("______________Object to primitive ");
			
			//#5 object to primitive
			Integer iObj3 = new Integer(1000);
			int iii = iObj3.intValue();
			float fff = iObj1.floatValue();
			
			//#6
			//Object to String 
			Integer iObj4 = new Integer(1000);
			//CTE String tempStr = iObj4
			String tempStr = iObj4.toString();
			
	
	}//end class
}//end class 