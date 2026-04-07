package D18;

import java.util.Scanner;

public class Pra {
    public static void main(String[] args) {

        int l = 0, b = 0;
        System.out.println("Enter to find area of  \n 1 for rectangle \n 2 for circle \n 3 for triangle \n 4 for square ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("Enter length");
                l = scan.nextInt();
                System.out.println("Enter breadth");
                b = scan.nextInt();
                System.out.println("Area of rectangle is " + (l * b));
            }
            case 2 -> {
                System.out.println("Enter radius");
                l = scan.nextInt();
                System.out.println("Area of circle is " + 2*(Math.PI * (l)));
            }
            case 3 -> {
                System.out.println("Enter base");
                l = scan.nextInt();
                System.out.println("Enter hight");
                b = scan.nextInt();
                System.out.println("Area of triangle is " + (l * b) / 2);
            }
            case 4 -> {
                System.out.println("Enter side length");
                l = scan.nextInt();
                System.out.println("Area of squar is " + (l*l));
            }
            default -> System.out.println("wrong input....");
        }


    }
}