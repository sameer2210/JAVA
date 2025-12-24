public class R3 {
	public static void main(String args[]){
	
	java.util.Random rand = new java.util.Random();
	
	char [] vowelList = new char[5];
	vowelList[0]='a';
	vowelList[1]='e';
	vowelList[2]='i';
	vowelList[3]='o';
	vowelList[4]='u';

	int selectedVowelIndex = rand.nextInt(vowelList.length);	
	char favoriteVowel = vowelList[selectedVowelIndex];
	System.out.println("my studuent said favorite vowel is " + favoriteVowel);

}
}