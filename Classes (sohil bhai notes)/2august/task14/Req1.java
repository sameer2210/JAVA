import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

//import java.util.*;		import all used util package classes
//import java.lang.String;	defualt package load or import
//import java.lang.System;	automatic


public class Req1 {
	public static void main (String args[]){
/*	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	java.util.Date d1 = new java.util.Date();
	java.util.Random rand = new java.util.Random();
*/	

	Date d1 = new Date();
	Random rand = new Random();	// all value random
	System.out.println(d1);		//current date
	System.out.println(rand.nextInt());	// 5654651
	System.out.println(rand.nextInt(5));	//0-5
	System.out.println(rand.nextFloat());	//0.54245
	System.out.println(rand.nextBoolean());	//true

}
}
