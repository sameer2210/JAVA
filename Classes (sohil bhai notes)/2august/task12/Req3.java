public class Req3 {
	public static void main (String args[]) {
	
	String original="sis   java  nit";
	//output = "sis java nit";
	System.out.println(original);
	String temp ="";
	String strArr[] = original.split(" ");

	for(int pos = 1;pos <=strArr.length;pos++){
	  String tempStr = strArr[pos-1];
	  //System.out.prinltn(tempStr);
	  //System.out.println(tempStr +"=" +tempStr.isEmpty());
	  if(tempStr.isEmpty()==false){
		if(pos==strArr.length){
			temp = temp +tempStr;
		}else{
			temp = temp +tempStr +" ";
		}
	  }
	}

}
}
