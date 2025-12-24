public class DemoGate{
	public static void main(String []args){
		Gate gateObj = new Gate();
		gateObj.totalNumberOfHandles=2;
		gateObj.totalLocks=3;
		gateObj.isOpenable=true;
		gateObj.isClosable=true;
		gateObj.matrialType="wood";
		gateObj.isBrakable=true;
		
		new Gate((short)2,(short)3,true,true,"wood3",true);
		
		System.out.println("totalNumberOfHandles : "+gateObj.totalNumberOfHandles);
		System.out.println("totalLocks : "+gateObj.totalLocks);
		System.out.println("isOpenable : "+gateObj.isOpenable);
		System.out.println("isClosable : "+gateObj.isClosable);
		System.out.println("matrialType : "+gateObj.matrialType);
		System.out.println("isBrakable : "+gateObj.isBrakable);
		
	}//end main
}//end class