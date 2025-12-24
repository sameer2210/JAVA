public class Student{
	
	String name;
	void addInfoInWhiteBoard(WhiteBoard sisWhiteBoard){
		System.out.println(name + " Student has WhiteBoard ref " + sisWhiteBoard +"start add info");
		
		try{Thread.sleep(3000); } catch(Exception e){}
		
			String temp = (int)(Math.random()*100)+ " :"+name;
			sisWhiteBoard.updateData(temp);
		System.out.println(name +" student has added info " +temp+ " in "+ sisWhiteBoard);
	}
	
		
}//end class