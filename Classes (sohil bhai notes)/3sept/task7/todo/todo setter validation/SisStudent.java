 public class SisStudent {
	private String name;
	private String gender;
	private int age;
	private String mobile;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name==null){
			System.out.println("***ERROR : name can not be null");
			return ;
			
		}
		
		name = name.trim();
		
		 if(name.isEmpty()){
			System.out.println("***ERROR : name can not be Empty");
			return ;
		 }
		
		 if( (name.length()>=3 && name.length()<=30)==false){
			 System.out.println("***ERROR : name length must be 3-30 char your name length("+name.length()+") "+ name);
			 return ;
		 }
		 
		boolean isValidChar=true;
		
		for(int p=1;p<=name.length();p++){
			char ch  = name.charAt(p-1);
			boolean c1  = ch>='a' && ch<='z';
			boolean c2  = ch>='A' && ch<='Z';
			boolean c3  = ch==' ';
			if((c1||c2||c3)==false){
				System.out.println("****ERROR name must contains a-z or A-z or Space " + name);
				return ;
			}
			///a-z A-Z  ' '
			
			
		}
		
		 //VALIDATE
		
		
		
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(("male".equalsIgnoreCase(gender))){
				this.gender = gender;
				return ;
		}else if(("female".equalsIgnoreCase(gender))){
				this.gender = gender;
				return ;
		}else if(("others".equalsIgnoreCase(gender))){
				this.gender = gender;
				return ;
		}else{
				System.out.println("**Error : gender must be correct (male/female/others) ");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if((age>=18 && age<=50)==false){
			System.out.println("***Error : age must be 18 to 50 ");
			return ;
		}
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}
	String takeNum="";
	boolean dicision=true;
	int countNum=0;
	public void setMobile(String mobile) {//+91 3435464854
	if(mobile.length()<=15){
		for(int check=1 ; check<=mobile.length() ; check++){
			char cha=mobile.charAt(check-1);
			if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z')){
					System.out.println("***Error : Use only digits in number ");
					return ;
			}
			if(check==1 && (cha=='+')==false){
				System.out.println("***Error : 1 char must be [ + ]");
				dicision=false;
				return ;
			}
			if(check==4 && (cha==' ')==false){
				System.out.println("***Error : 4 char must be [ space ]");
				dicision=false;
				return;
			}
			if(check>=1 && check<=4){
					if(dicision){ 
							takeNum+=cha; 
						}
			}else{
						if(check>=5 && check<=mobile.length()){
						countNum++;
							takeNum+=cha;
							}
			}	
		}
		}else{ 
			System.out.println("**Error : Total digits in entered number must be less or equal = 15 ");
			}
		
		if(countNum==10){
			mobile=takeNum;
			this.mobile = mobile;
		}else{
			System.out.println("***Error : *After space number must be 10 digits");
		}
	}
	String collect=""; 
	boolean dici=false;
	public void setEmail(String email){//sohilnit@gmail.com
		if(email.length()<=50){
				for(int check=1 ; check<=email.length ; check++){
						char cha = email.charAt(check-1);
						if('@'==cha){
							collect+=cha;
							dici=true;
						}
						if(dici){
							collect+=cha;
						}
						
					}
				
		}else{
			System.out.println("Email length must be less than 50 characters");
		}
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}
