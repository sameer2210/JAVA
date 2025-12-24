
public class Req1 {

	public static void main(String[] args) {
		//String original ="sis---java----nit";
		String original="sis   java  nit";
		//output  ="sis java nit";

		String temp="";
		
		for(int pos=1;pos<=original.length();pos++){
			
			int currentIndex =pos-1;
			int nextIndex =currentIndex+1;
			
			if(pos==original.length()){
				temp = temp + original.charAt(currentIndex);
				break;
			}
			char currentChar = original.charAt(currentIndex);
			char nextChar = original.charAt(nextIndex);
			
			if(currentChar==' ' && nextChar==' '){
				//skip
			}else{
				temp = temp+currentChar;
			}//
			
		}//loop
		
		System.out.println(temp);
	}
}
