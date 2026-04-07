package D18;

import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

/*  // 44 guessing game

        int n = 0;
        int a = 0;
        System.out.println("wellcome to world of gammers \n enter any no B/W 1-500 to play a game");
        Random rd = new Random();
        a = (int) (Math.random()* 500) + 1;                                  //or check this
        do {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (a > n) {
                System.out.println("no is too low.. try again");
            } else if (a < n) {
                System.out.println("no is too high .. try again");
            } else if (n == a) {
                System.out.println("--------------------------------");
                System.out.println(" you win ...... " + " \n computer choose no = " + a + " \n      your no is = " + n);
            }
        } while (n != a);
*/

/*  //  45  Project Restuarent


        int user = 0;
        String menu = " ";
        int total = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" Wellcome to technorent -----\n Enter 1 to Indian food \n Enter 2 to Chinese food ");
            System.out.println(" Enter 3 to Russian food \n Enter 4 to Italian food \n Enter 0 to EXIT from menu");
            System.out.println(" --------------------------- ");
            user = sc.nextInt();
            switch (user) {
                case 1 -> {
                    System.out.println(" wellcome to Indian food ----");
                    System.out.println(" dosa - Rs 100");
                    System.out.println(" briyani - Rs 300");
                    System.out.println(" chole bhature - Rs 200");
                    System.out.println("lassi - Rs 150");
                    int a = sc.nextInt();
                    switch (a) {
                        case 1 -> total = total + 100;
                        case 2 -> total = total + 300;
                        case 3 -> total = total + 200;
                        case 4 -> total = total + 150;
                    }
                }
                case 2 -> {
                    System.out.println("wellcome to chinese food----");
                    System.out.println(" noddles - Rs 200");
                    System.out.println(" manchuriyan - Rs 250");
                    System.out.println(" momos - Rs 100");
                    System.out.println("chamgadar ka suup - Rs 150");
                    int a = sc.nextInt();
                    switch (a) {
                        case 1 -> total = total + 200;
                        case 2 -> total = total + 250;
                        case 3 -> total = total + 100;
                        case 4 -> total = total + 150;
                    }
                }
                case 3 -> {
                    System.out.println("wellcome to Russian food----");
                    System.out.println(" solyanka - Rs 6000");
                    System.out.println(" okraosha - Rs 8000");
                    System.out.println(" shchi - Rs 5000");
                    System.out.println(" maal - Rs 10000");
                    int a = sc.nextInt();
                    switch (a) {
                        case 1 -> total = total + 6000;
                        case 2 -> total = total + 8000;
                        case 3 -> total = total + 5000;
                        case 4 -> total = total + 10000;
                    }
                }
                case 4 -> {
                    System.out.println("wellcome to Italian food----");
                    System.out.println(" pasta - Rs 500");
                    System.out.println(" risottos - Rs 1000");
                    System.out.println(" pizza - Rs 600");
                    System.out.println("aakri pasta - Rs 15000");
                    int a = sc.nextInt();
                    switch (a) {
                        case 1 -> total = total + 500;
                        case 2 -> total = total + 1000;
                        case 3 -> total = total + 600;
                        case 4 -> total = total + 15000;
                    }
                }
                case 5 -> {
                    System.exit(0);
                }
                default -> menu = "wrong input ";

            }
            System.out.println("press 5 to repeat");
            System.out.println("press 0 to EXIT");
            user = sc.nextInt();
        } while (user == 5);
        System.out.println(" total " + total);
 */

    //  Math.random mai +1 karna padta hai if not then last value not print

        for (int i = 1; ; i++) {
            int ans = (int) (Math.random() * 10) + 1;
            System.out.println(ans + "----" + i);
            if (ans == 10)
                break;
        }


    }
}
