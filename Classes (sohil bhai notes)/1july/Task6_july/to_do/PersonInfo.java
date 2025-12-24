public class PersonInfo{

	public static void main(String args[]){
	
	
//byte -128  127
//age totalFinger totalTeeth    totalHobbies
byte totalTeeth;

totalTeeth = 20;
//_________________________________________
//short  -32768  32767    numberOfBones   hight totalHair  heartBeat
short numberOfBones = 204;
//int-2147483648   2147483647  perDayThougts  totalWBC 
//(10)
int perDayThougts=50000;

//dailyFootSteps
 //(19)//long-9223372036854775808   9223372036854775807 totalBodyCells
 //mobileNumber  //9009442844     //  "+91 9009442844"
//long mobileNumber =9009442844; //CTE
//long mobileNumber =9009442844l;
long mobileNumber =9009442844L;

//float 1.4E-45 3.4028235E38
//bodyTemperature  height  weight  rs, es.. totalBlood   soundFrequency
//CTE float bodyTemperature =97.5;
float bodyTemperature =97.5F;//f F

//double 4.9E-324  1.7976931348623157E308
//redCellWeight 
double redCellWeight =238574987545.5554435 ;

//boolean      fit  isMarried  isBlind  educated
boolean isFit =true;

//char nameFirstLetter favoriteCharacter
char favoriteCharacter='$';
System.out.println("++++++++++++++++++++++++++++++++++");
System.out.println("Total teeth = " +totalTeeth);
System.out.println("Total number of bones "+numberOfBones);
System.out.println("Daily thoughts " + perDayThougts);
System.out.println("Mobile number  " + mobileNumber);
System.out.println("Body Temperatur " + bodyTemperature);
System.out.println("Bach red cell weight " + redCellWeight);
System.out.println("Is Fit ? " + isFit);
System.out.println("Favorite character  = " +favoriteCharacter);
System.out.println("++++++++++++++++++++++++++++++++++");

String name="Ramesh";
String color="fair";
String gender="male";
System.out.println("Name :  " + name);
System.out.println("Color : " + color);
System.out.println("Gender : " + gender);

System.out.println("__________________________________");
String sisMsg ="Success "  +"is "  + "Sure "  +"*If you want .";
System.out.println("Sis Message  = " +  sisMsg);
System.out.println("__________________________________");





  }//main

}//class