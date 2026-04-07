package D43;

import java.util.Scanner;

public class Oops91 {

//    91- Design Private Cab Service - Graphic

    String carType;
    double km;
    double bill;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter car type AC or NON AC");
        carType = sc.nextLine().toLowerCase();
        System.out.println("how many distance you want to travel in Km");
        km = sc.nextInt();
    }

    void calculate() {
        if (carType.equals("ac")) {
            if (km <= 5) bill = 150;
            else bill = 150 + (km - 5) * 10;
        } else if (carType.equals("non ac")) {
            if (km <= 5) bill = 120;
            else bill = 120 + (km - 5) * 8;
        }
    }

    void display() {
        System.out.println("you choose " + carType);
        System.out.println("your total distance is " + km);
        System.out.println("your total bill is " + bill);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Oops91 cb = new Oops91();
        cb.accept();
        cb.calculate();
        cb.display();


    }


}
