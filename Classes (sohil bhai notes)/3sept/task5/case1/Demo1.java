public class Demo1{
	public static void main(String args[]){
	
	LineSeperator Is = new LineSeperator();
	
		Is.decorateLine();
		Is.decorateLine('A');
		Is.decorateLine('$',20);
		
		
		//Is.decorateLine();				//error
		//Is.decorateLine(50.5);		//error
		//Is.decorateLine("happy");	//error
	

	
	}//end main
}//end class