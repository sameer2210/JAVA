public class StuAttApp {
	public static void main (String args[]) {
	
	//String [] studentNames = new String [21];
	String [] studentNames = {
	"Sameer","kalash","chetan","namak","srashti","hansita","prabhat",
	"Deeksha","Akansha","jitendra","om","murlidhar","piyush","anjali",
	"karan","tapu","sonu","goli","goggi","pinku","popatlal"
	};
	boolean [] todayAttendance = new boolean[studentNames.length];
	//all false
	//sis Think all student present(true)
	//fill it with true
	/*
	for(int stu=1;stu<=studentNames.length;stu++){
	todayAttendance[stu-1]=true;
	}*/

	java.util.Arrays.fill(todayAttendance,true);
	
	//then update
	System.out.println("total student" + studentNames.length);
	for(int stu =1;stu<=studentNames.length;stu++){
	String name = studentNames[stu-1];
	boolean isPresent = todayAttendance[stu-1];
	System.out.printf("#%-2d %-15s isPresent %-5s \n" ,stu ,name ,isPresent);
	}

}
}
