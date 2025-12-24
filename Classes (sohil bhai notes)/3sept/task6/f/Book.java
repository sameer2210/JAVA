public class Book{

	String name;
	int totalPage;
	float price;
	
	void info(){
	 System.out.println("______________________");
	 System.out.println(this + "info");
	 System.out.println("name = " + name);
	 System.out.println("total page = " + totalPage);
	 System.out.println("price = " + price);
	 System.out.println("_______________________");
	}
	
	void updateInfo(String name,int totalPage,float price){
	 System.out.println(this + "update called info..........");
		this .name = name;
		this.totalPage = totalPage;
		this.price = price;
	}
	
}//end calss