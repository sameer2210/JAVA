import java.util.Scanner;

public class Req2update {
	public static void main(String[] args) {

		//S.K.Sao  R.K.Sharma  V.K.Singh
		//String name  = "Surendra Kumar Sao";//ok test
		//String name  = "Surendra Kumar";//ok test
		//String name  = "Surendra";//ok //test
		//String name  = "surendra kumar sao";//s.k.sao  not ok
		//String name  = "SURENDRA KUMAR SAO";//S.K.SAO  not ok
		//String name  = "surendra KUmar sAo";//S.K.SAO  not ok

		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name  = scan.nextLine();
		name = name.toUpperCase();
		System.out.println("________________________________");
		
		String nameArr [] = name.split(" ");
		System.out.println(name);
		System.out.println(java.util.Arrays.toString(nameArr));
		StringBuilder sb = new StringBuilder();
		for(int w=1;w < nameArr.length;w++){
			String temp = nameArr[w-1];
			//System.out.println(temp);
		
			sb.append(temp.charAt(0) +".");
		}
	
		String lastName = nameArr[nameArr.length-1];
		char part1 = lastName.charAt(0);
		String part2 = lastName.substring(1);
		part2 = part2.toLowerCase();
		sb.append(part1 + part2);	
		System.out.println(sb);
	
}
}
