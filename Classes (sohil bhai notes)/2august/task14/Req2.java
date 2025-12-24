public class Req2 {
	public static void main (String args []) {
	
	String [] wordList = {"java","sis","nit","career","job","success","salary","enjoyment"};
	
	//limit:
	//req print
	for(int w=1;w<=wordList.length;w++){
	  String name = wordList[w-1];
	  System.out.println(name +" ");
	}

	System.out.println("\nbetter way----------------for each");
	for(String name : wordList){
	  System.out.println(name);
	}
	
	System.out.println("\n+++++++++++++++++++++++++++");
	//req print
	for(int w=1;w<=wordList.length;w++){
	  String name = wordList[w-1];
	  System.out.println("sno# " + w + " = " +name);
	}

System.out.println("___________________________________________");
	
	int arr[] ={231,56,123,165,4,65,13,135};
	 for (int num:arr){
	 System.out.print(num +" ");
	 }
	
	System.out.println();
	java.util.Arrays.sort(arr);
	 for(int num:arr){
	 System.out.print(num +" ");
	 }


}
}