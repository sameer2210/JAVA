public class Dicernd {
	public static void main( String args[] ){
	java.util.Random rand = new java.util.Random();
	
	int diceNumber1;
	int diceNumber2;
	long st1 = System.nanoTime();
	int a = (int)(Math.random()*10);
	diceNumber1 = (a%6) +1;
	long et1 = System.nanoTime();
	
	long st2 = System.nanoTime();
	diceNumber2 = rand.nextInt(6) +1;
	long et2 = System.nanoTime();
	
	System.out.println("way1 "+(et1-st1));
	System.out.println("way2 "+(et2-st2));
	System.out.println("**********************************");
	System.out.println(diceNumber1);
	System.out.println(diceNumber2);

System.out.println("______________________________________________");

}
}



