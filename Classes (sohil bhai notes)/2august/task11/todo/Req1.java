
public class Req1 {

	public static void main(String[] args) {
		int []arr  ={11,22,33,44,55,66,77,88,99,12,34,56,76,77,88,67,22,33,44,55,66,77,88,99,12,34,56,76,77,88,67};
		
		//output [11,22,33,44,55,66,77,88,99]
		long startTime = System.nanoTime();
		String str = new String("[");
		for(int e=1;e<=arr.length;e++){
			int value = arr[e-1];
			if(e<arr.length){
			str =str  +value +", ";
			}else{
				str =str  +value;
			}
		}
		str = str+"]";
		long endTime = System.nanoTime();
		//way2
		long startTime2 = System.nanoTime();
		String str2 = java.util.Arrays.toString(arr);
		long endTime2 = System.nanoTime();
		
		//WAY3 SURENDRA WAY
		long startTime3 = System.nanoTime();
		StringBuilder sb  = new StringBuilder("[");
		for(int e=1;e<=arr.length;e++){
			if(e<arr.length){
				sb.append(arr[e-1] +", ");
			}else{
				sb.append(arr[e-1]);
			}
		}
		sb.append("]");
		long endTime3 = System.nanoTime();
		
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(sb);
		System.out.println("stu:way1 total time "+ (endTime-startTime)+"ns");
		System.out.println("SMS:WAY2 total time "+ (endTime2-startTime2)+"ns");
		System.out.println("SIS:WAY3 total time "+ (endTime3-startTime3)+"ns");
	}

}
