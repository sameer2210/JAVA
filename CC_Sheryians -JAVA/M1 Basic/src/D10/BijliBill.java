package D10;

public class BijliBill {
    public static void main(String[] args) {


//  21 BijliBill system
/*
        int units = 150;
        if (units > 0 && units <= 100) {
            System.out.println(units * 4.2);
        } else if (units > 100 && units <= 200) {
            System.out.println(100 * 4.2 + (units - 100) * 6);
        } else if (units > 200 && units <= 400) {
            System.out.println(100 * 4.2 + 100 * 6 + (units - 200) * 8);
        } else {
            System.out.println(100 * 4.2 + 100 * 6 + 200 * 8 + (units - 400) * 13);
        }
*/
//or
/*
        int units = 450;
        double pre100 = 420, pre200 = 1020, pre400 = 2620;
        if (units > 0 && units <= 100) {
            System.out.println(units * 4.2);
        } else if (units > 100 && units <= 200) {
            System.out.println(pre100 + (units - 100) * 6);
        } else if (units > 200 && units <= 400) {
            System.out.println(pre200 + (units - 200) * 8);
        } else {
            System.out.println(pre400 + (units - 400) * 13);
        }
*/
//or

        int units = 100;
        double amt = 0;
        if (units > 400) {
            amt = amt + (units - 400) * 13;
            units = 400;
        }
        if (units > 200) {
            amt = amt + (units - 200) * 8;
            units = 200;
        }
        if (units > 100) {
            amt = amt + (units - 100) * 6;
            units = 100;
        }
        amt = amt + units * 4.2;
        System.out.println(amt);

    }
}
