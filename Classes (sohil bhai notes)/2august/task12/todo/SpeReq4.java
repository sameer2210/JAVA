public class SpeReq4 {
	public static void main(String[] args) {

		String orignalStr ="  SIS JAVA NIT  ";
		System.out.println("original "+orignalStr);
		System.out.println(orignalStr.length());
		String trim1 = orignalStr.trim();
		System.out.println("API trim1 "+trim1);
		System.out.println("trim1 "+trim1.length());
		
		//own logic
		long startTime1=System.nanoTime();
		int trimStartPos=-1;
		for(int p=1;p<=orignalStr.length();p++){
			char ch  = orignalStr.charAt(p-1);
			if(ch!=' '){
				trimStartPos =p;
				break;
			}
		}
		int trimLastPos=-1;
		for(int p=orignalStr.length();p>=1;p--){
			
			char ch  = orignalStr.charAt(p-1);
			if(ch!=' '){
				trimLastPos =p;
				break;
			}
		}

		System.out.println("trim start pos "+trimStartPos);
		System.out.println("trim last pos "+trimLastPos);
		
		StringBuilder trimedSb = new StringBuilder();
		for(int pos=trimStartPos;pos<=trimLastPos;pos++){
			char ch = orignalStr.charAt(pos-1);
			trimedSb.append(ch);
			
		}
		
		long endTime1=System.nanoTime();
		System.out.println("Way 1 : "+(endTime1-startTime1));
		String trim2=trimedSb.toString();//string builder to string
		System.out.println(trim2);
		
	}
}
