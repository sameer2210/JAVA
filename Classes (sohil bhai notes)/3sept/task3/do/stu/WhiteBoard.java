public class WhiteBoard{
	
	StringBuilder data = new StringBuilder();
	
	void updateData(String newData){
		data.append(newData+"\n");
	}
	
	void showData(){
	   System.out.println("___________info____________");
	  if(data.length()==0){
		System.out.println("no data found");
		return;
	  }
	   System.out.println(data);
	   System.out.println("_____________________________");
	}
	
		
}//end class