import java.util.Arrays;
import java.util.Random;

public class User {
	private long id;
	private String name;
	private String gender;
	private String mobile;
	private final int [] userGameNumberList;
	private int totalMatchedNumber;
	
	private static int [] pickedNumberList;
	private final static int[] COMMAN_GAME_NUMBER_LIST;
	private final static int COMMAN_GAME_NUMBER_LIST_SIZE;
	private final static int USER_NUMBER_LIST_SIZE;

//class loading time setting data
	static{
			COMMAN_GAME_NUMBER_LIST_SIZE=20;
			USER_NUMBER_LIST_SIZE=5;
			pickedNumberList = new int[COMMAN_GAME_NUMBER_LIST_SIZE];
			Arrays.fill(pickedNumberList, -1);
		
			//create array with uniqe numbers
			COMMAN_GAME_NUMBER_LIST = new int [COMMAN_GAME_NUMBER_LIST_SIZE];
			Arrays.fill(COMMAN_GAME_NUMBER_LIST ,-1);

			//Spo(Arrays.toString(COMMAN_GAME_NUMBER_LIST));
			Random rand = new Random();
			int currentPos=1;
			
		while(true){
							//todo fill new number
							int value = rand.nextInt(100)+1;
							
							//check if exist or not
							boolean isAlreadyExist=false;
					for(int x=1;x<=currentPos;x++){
						int temp = COMMAN_GAME_NUMBER_LIST[x-1];
						if(temp==value){
							isAlreadyExist=true;
								 break;
						}//if
					}//end loop
							
						if(isAlreadyExist){
								continue;
						}
							
							//fill if not exist
							COMMAN_GAME_NUMBER_LIST[currentPos-1]= value;
							//goto next pos
							currentPos++;
							//stop fill if all filled
						if(currentPos>COMMAN_GAME_NUMBER_LIST.length){
								break;
						}
		}//while
			System.out.println(Arrays.toString(COMMAN_GAME_NUMBER_LIST));
	}//static block
	
//object block
	  {
		Random rand = new Random();
		userGameNumberList = new int[USER_NUMBER_LIST_SIZE];
		Arrays.fill(userGameNumberList,-1);
		
		//fill with unique number from comman game number list
		int position=1;
		while(true){
			int pickIndex = rand.nextInt(COMMAN_GAME_NUMBER_LIST_SIZE);
			int value = COMMAN_GAME_NUMBER_LIST[pickIndex];
			
			boolean isAlreadyExist = false;
			for(int p=1;p<=position;p++){
				int temp = userGameNumberList[p-1];
				if(value==temp){
					isAlreadyExist = true;
					break;
				}//if
			}//loop
			
			if (isAlreadyExist){
				continue;
			}
			
			userGameNumberList[position-1]=value;
			position++;
			if(position>userGameNumberList.length){
				break;
			}
		}//while
		//System.out.println(this + " " + Arrays.toString(userGameNumberList));
	  }//end non static block
	  
//id object block
	 {
		id = IdGenerator.getId();
	  }//end object block
	  
	  
	public User(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public User(String name, String gender, String mobile){
		this(name, gender);
		this.mobile = mobile;
	}
	
	public void showInfo(){
		System.out.println("# "+id +": "+name +"; "+gender +"; "+mobile +":"+Arrays.toString(userGameNumberList));
	}
	
	public static void showCommanNumberList(){
		System.out.println("_____________________________");
		System.out.println("common number List for all user " );
		System.out.println(Arrays.toString(COMMAN_GAME_NUMBER_LIST));
		System.out.println("_____________________________");
	}
	
	public void getshowMatched(){
		System.out.println("# "+id +": " +name +"total matched : "+totalMatchedNumber +" "+Arrays.toString(userGameNumberList));
	}
	
	public static int[] getCommanNumberList(){
		return COMMAN_GAME_NUMBER_LIST;
	}
	
	private static int totalSize=1;
	public static int pickedNumberForAllUser(){
		Random rand = new Random();
		while(true){
			int pickIndex = rand.nextInt(COMMAN_GAME_NUMBER_LIST.length);
			int value = COMMAN_GAME_NUMBER_LIST[pickIndex];
			boolean alreadyFound=false;
			for (int p=1;p<pickedNumberList.length;p++){
				int temp = pickedNumberList[p-1];
				if(temp==value){
					alreadyFound=true;
					break;
				}
			}//for
			if(alreadyFound==true){
					continue;
			}
				pickedNumberList[totalSize-1]=value;
				totalSize++;
				return value;
		}//while
	}//method

	public void updateMatchedNumber(int pickNumber){
		//if found in his number list
		for(int pos =1;pos<=userGameNumberList.length;pos++){
			int value = userGameNumberList[pos-1];
			if(pickNumber==value){
				totalMatchedNumber++;
			}
		}//loop
	}//method
	
	public boolean isWinner(){
		if(totalMatchedNumber==userGameNumberList.length){
			System.out.println("I M Winner " +id +" :" +name +": "+gender);
		}
		return totalMatchedNumber==userGameNumberList.length;
	}
	
	public static int [] getPickedNumbers(){
		return pickedNumberList;
	}

}//class

