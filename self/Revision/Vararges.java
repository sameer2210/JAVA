package revision;

public class Vararges {
	static int add (int ...arr) {
		int result =0;
		for(int a : arr) {
			result = result+a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(2,4,6));
		System.out.println(add(2,4,6,8));
		
		
		
	}

}
