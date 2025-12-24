public class LineSeperator{
	
	void decorateLine(){
	 System.out.println("______________________");
	}
	
	void decorateLine(char ch){
	 for(int p=1;p<=30;p++){
		System.out.print(ch);
	 }
	 System.out.println();
	}
	
	void decorateLine(char ch,int totalCharPrint){
		for(int p=1;p<=totalCharPrint;p++){
			System.out.print(ch);
		}
		System.out.print(ch);
	}
	
	
	
}//end class