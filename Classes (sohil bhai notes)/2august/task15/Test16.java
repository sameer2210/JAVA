public class Test16 {
	public static void main (String args[]){
	
	String s1 = "book";
	String s2 = "okob";
		System.out.println(s1);
		System.out.println(s2);

	if(s1.length()==s2.length()){
	
	  char [] arr1 = s1.toCharArray();
		//manual array char []arr1 = new char [s1.length]then fill it
	  char [] arr2 = s2.toCharArray();
		java.util.Arrays.sort(arr1);
		java.util.Arrays.sort(arr2);
	
		boolean isAllMatch=true;
		for(int p=1;p<=arr1.length;p++){
		  char ch1 = arr1[p-1];
		  char ch2 = arr2[p-1];
			if(ch1!=ch2){
			isAllMatch =false;
			break;
			}
		}
	  if(isAllMatch){
		System.out.println("Annagram");
	  }else{
		System.out.println("Not Annagram");
	  }
	}else{
	  System.out.println("Not Annagram");
	}

}
} 