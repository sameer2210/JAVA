public class Card1 {
	public static void main (String args[] ) throws Exception{

	String []cards = {"ACE","KING","QUEEN","JACK","10","9","8","7","6","5","4","3","2"};
	System.out.println("total cards " + cards.length);
	
	//PICK 1 BY 1
	for(int c=1;c<=cards.length;c++){
	String name = cards[c-1];
	System.out.println(name);
	}
	String arrStr = java.util.Arrays.toString(cards);
	System.out.println(arrStr);
/*	
	//swap
	int pos1 =7;
	int pos2 = 2;
	String temp = cards[pos1-1];
	cards[pos1-1] = cards[pos2-1];
	cards[pos2-1] =temp;
*/	
	java.util.Random rand = new java.util.Random();
	for (int c=1;c<=cards.length;c++){
	int pos1=c;
	int pos2=rand.nextInt(cards.length)+1;
	String temp = cards[pos1-1];
	cards[pos1-1]=cards[pos2-1];
	cards[pos2-1]=temp;
	Thread.sleep(600);
	System.out.println(java.util.Arrays.toString(cards));
	}	
	System.out.println(java.util.Arrays.toString(cards));
	
}
}
