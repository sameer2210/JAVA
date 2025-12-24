
import java.util.Scanner;
import java.util.Random;

public class RockPaperSicssorGame {

	public static void main(String[] args) {

		System.out.println("give input \n '0=for rock'\n '1=for paper'\n '2=for scissor' ");
    	
	     Scanner scan=new Scanner(System.in);
	     int userInput = scan.nextInt();
	       System.out.println("you choose " + userInput);
	        
	     Random rand= new Random();
	      int comInput = rand.nextInt(3);
	   
	      
	      
	     if(comInput==userInput) {
	        System.out.println("match drow");
	     }else if(comInput==0 && userInput==2 || comInput==1 && userInput==0
	    		 || comInput==2 && userInput==1){
	        System.out.println("compuer win\n");
	     }else{
	    	System.out.println("you win ");
	     }
	     
	     // computer input
	      
	     if(comInput==0){
	    	 System.out.println("computer choose= rock");
	     }else if(comInput==1){
	    	 System.out.println("computer choose= paper");
	     }else if(comInput==2){
	    	 System.out.println("computer choose= scissor");
	     }
	   	
		
	}

}
