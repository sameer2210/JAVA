public class Req1 {
	public static void main (String args[]){

	String orignal="java       sis      nit";
	//output  ="java sis nit";
	
	String temp="";
	for(int pos=1;pos<=orignal.length();pos++){
	
	  int currentIndex = pos-1;
	  int nextIndex =currentIndex+1;
	
	  if(pos==orignal.length()){
		temp = temp + orignal.charAt(currentIndex);
		break;
	  }
	  char currentChar = orignal.charAt(currentIndex);
	  char nextChar = orignal.charAt(nextIndex);
	
	  if(currentChar==' ' && nextChar==' '){
	  }else{
		temp = temp+currentChar;
	  }
	}
	System.out.println("input = "+orignal);
	System.out.println("output= "+temp);
	

}
}