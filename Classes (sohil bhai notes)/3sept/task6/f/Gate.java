public class Gate{
		
		short totalNumberOfHandles;
		short totalLocks;
		boolean isOpenable;
		boolean isClosable;
		String matrialType;
		boolean isBrakable;
		Gate(){
			System.out.println("No para args constructor called");
		}
		 Gate(short totalNumberOfHandles,short totalLocks,boolean isOpenable,boolean isClosable,String matrialType,boolean isBrakable){
			System.out.println("6 para args constructor called");
			this.totalNumberOfHandles=totalNumberOfHandles;
			this.totalLocks=totalLocks;
			this.isOpenable=isOpenable;
			this.isClosable=isClosable;
			this.matrialType=matrialType;
			this.isBrakable=isBrakable;
		}
}//end class