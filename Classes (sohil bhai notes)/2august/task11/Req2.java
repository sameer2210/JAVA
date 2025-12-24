public class Req2 {
	public static void main (String args[]){
	
	//S.K.Sao R.K.Sharma V.K.Singh
	//String name = "Surendra Kumar Sao";
	//String name = "Surendra Kumar";
	//String name = "Surendra";
	//String name ="suremdra kumar sao";
	String name = "SURENDRA KUMAR SAO";
	
	String nameArr [] = name.split(" ");
	System.out.println(name);			        //SURENDRA KUMAR SAO
	System.out.println(java.util.Arrays.toString(nameArr));  //[ SURENDRA,  KUMAR,  SAO ]
	StringBuilder sb = new StringBuilder();
	for(int w=1;w < nameArr.length;w++){
		String temp = nameArr[w-1];
		//System.out.println(temp);
	
		sb.append(temp.charAt(0) +".");
	}
	
	String lastName = nameArr[nameArr.length-1];
	sb.append(lastName);
	System.out.println(sb);			//S.K.SAO
	
}
}
