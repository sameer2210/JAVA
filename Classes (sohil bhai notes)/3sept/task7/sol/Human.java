public class Human{
	
		private String name;
		private int age;
		private String gender;
		private String color;
		private String bloodGroup;
		private String mobileNumber;
		
		public String getName(){
			return name;
		}
		public void setName(String name){
			//validate hear if required
				this.name = name;
		}
		
		public int getAge(){
			return age;
		}
		public void setAge(int age){
			this.age = age;
		}
		
		public String getGender(){
			return gender;
		}
		public void setGender(String gender){
				this.gender = gender;
		}
		
		public String getColor(){
			return color;
		}
		public void setColor(String color){
			this.color = color;
		}
		
		
		public String getBloodGroup(){
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup){
			this.bloodGroup = bloodGroup;
		}
		
		public String getMobileNumber(){
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber){
			this.mobileNumber = mobileNumber;
		}
		
		void eat(){
			System.out.println(name + " eating......"+this);
		}
		void speak(){
			System.out.println(name + " speak.......");
		}
		
		void showAll(){
			System.out.println("name " + name);
			System.out.println("age " + age);
			System.out.println("color " + color);
			System.out.println("gender " + gender);
			System.out.println("bloodGroup " + bloodGroup);
			System.out.println("mobileNumber " + mobileNumber);
			System.out.println("______________________________");
		}
		
	
}//end class