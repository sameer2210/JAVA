public class Student {
	int id;
	String name;
	String gender;
	int age;
	String branch;
	String college;
	int sem;
	float percentage;
	String email;
	String mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String getBranch(){
		return branch;
	}
	public void setBranch(String branch){
		this.branch = branch;
	}
	public String getCollege(){
		return college;
	}
	public void setCollege(String college){
		this.college = college;
	}
	
	public int getSem(){
		return sem;
	}
	public void setSem(int sem){
		this.sem = sem;
	}
	public float getPercentage(){
		return percentage;
	}
	public void setPercentage(float percentage){
		this.percentage = percentage;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getMobile(){
		return mobile;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public Student(int id, String name, String gender, int age, String branch,
							  String college, int sem, float percentage, String email,
								String mobile){
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.branch = branch;
		this.college = college;
		this.sem = sem;
		this.percentage = percentage;
		this.email = email;
		this.mobile = mobile;	
	}
	
	public String toString(){
		String info = " name; " + name + " college " + " mobile " + mobile;
		return info;
	}
	
}//end class
	