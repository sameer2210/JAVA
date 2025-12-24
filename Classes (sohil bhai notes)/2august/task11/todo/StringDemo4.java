public class StringDemo4 {
	public static void main(String[] args) {
		String   str  ="java is simple ";//input
		String wordArr [] = str.split(" ");
		System.out.println("wordArr " + wordArr);
		System.out.println("total word " + wordArr.length);
		System.out.println(java.util.Arrays.toString(wordArr));
		for(int w=1;w<=wordArr.length;w++){
			System.out.println("word#"+w +" = " + wordArr[w-1]);
		}
	}
}
