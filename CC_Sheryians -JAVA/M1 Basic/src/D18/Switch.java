package D18;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

//    42 week days using switch

        System.out.println("give no. acc to days....");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
/*
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:                ;
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("satday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("wrong input");
        }
*/

//  OR  java 14 version
/*
        switch (day) {
            case 1, 2, 3 -> {
                System.out.println("monday");
            }
            case 4 -> {
                System.out.println("tuesday");
            }
            default -> System.out.println("wrong input");
        }
*/
//  OR
/*
        String ans = "";
        switch (day) {
            case 1 -> ans = "monday";
            case 2 -> ans = "tuesday";
            case 3 -> ans = "wednesday";
            default -> ans = "wrong input";
        }
        System.out.println(ans);
*/

        String ans = switch (day) {
            case 1 -> ans = "monday";
            case 2 -> ans = "tuesday";
            default -> ans = " wrong input";
        };
        System.out.println(ans);


    }
}
