public class SisStudent{
	String name;
		String favoriteWord;
		int totalGivenWords;
		String trainerWords[] = new String[100];
		
			void saySomething(){
			 System.out.println("my Name is " + name);
			 System.out.println("my favorite word is " + favoriteWord);
			 System.out.println("total GivenWords " + totalGivenWords);
				for(int w=1;w<=totalGivenWords;w++){
					System.out.println("sno# " +w +" = " + trainerWords[w-1]);
				}
			}
				
			void updateFavoriteWord(String word){
				favoriteWord =word;
				javax.swing.JOptionPane.showMessageDialog(null, name +"updated word " + word);
			}
			
			//start toalGivenWords =0
			void updateWords(String word){
			trainerWords[totalGivenWords] = word;
			totalGivenWords++;
			}
				
	
	}//end class