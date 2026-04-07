package D43;

import java.util.Scanner;

public class Oops92 {

//    92- Design a class RailwayTicket - Graphic

    String name;
    long mobNo;
    String coach;
    String StationTo;
    int ServiceAmt;
    int TravelAmt;
    int totalAMT;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name - ");
        name = sc.nextLine();
        System.out.println("Enter your mobile Number - ");
        mobNo = sc.nextLong();
        System.out.println("which coach/class do you want to travel \n First-AC \n Second-Ac \n Third-Ac \n Sleeper");
        coach = sc.nextLine();
        coach = sc.nextLine().toUpperCase();
        System.out.println("Station From = Delhi to - Agra Rs-100 , Bhopal Rs-200 , goa Rs-300 , Mumbai Rs-400 , Tamil-Nadu Rs-500");
        StationTo = sc.nextLine().toUpperCase();

    }

    void update() {
        int AGRA = 100;
        int BHOPAL = 200;
        int GOA = 300;
        int MUMBAI = 400;
        int TAMIL_NADU = 500;

        if (coach.equals("FIRST-AC")) {
            ServiceAmt = 700;
            if (StationTo.equals("AGRA")) totalAMT = ServiceAmt + AGRA;
            else if (StationTo.equals("BHOPAL")) totalAMT = ServiceAmt + BHOPAL;
            else if (StationTo.equals("GOA")) totalAMT = ServiceAmt + GOA;
            else if (StationTo.equals("MUMBAI")) totalAMT = ServiceAmt + MUMBAI;
            else if (StationTo.equals("TAMIL-NADU")) totalAMT = ServiceAmt + TAMIL_NADU;
            else System.out.println("wrong Input Try Again");
        } else if (coach.equals("SECOND-AC")) {
            ServiceAmt = 500;
            if (StationTo.equals("AGRA")) totalAMT = ServiceAmt + AGRA;
            else if (StationTo.equals("BHOPAL")) totalAMT = ServiceAmt + BHOPAL;
            else if (StationTo.equals("GOA")) totalAMT = ServiceAmt + GOA;
            else if (StationTo.equals("MUMBAI")) totalAMT = ServiceAmt + MUMBAI;
            else if (StationTo.equals("TAMIL-NADU")) totalAMT = ServiceAmt + TAMIL_NADU;
            else System.out.println("wrong Input Try Again");
        } else if (coach.equals("THIRD-AC")) {
            ServiceAmt = 250;
            if (StationTo.equals("AGRA")) totalAMT = ServiceAmt + AGRA;
            else if (StationTo.equals("BHOPAL")) totalAMT = ServiceAmt + BHOPAL;
            else if (StationTo.equals("GOA")) totalAMT = ServiceAmt + GOA;
            else if (StationTo.equals("MUMBAI")) totalAMT = ServiceAmt + MUMBAI;
            else if (StationTo.equals("TAMIL-NADU")) totalAMT = ServiceAmt + TAMIL_NADU;
            else System.out.println("wrong Input Try Again");
        } else if (coach.equals("SLEEPER")) {
            ServiceAmt = 100;
            if (StationTo.equals("AGRA")) totalAMT = ServiceAmt + AGRA;
            else if (StationTo.equals("BHOPAL")) totalAMT = ServiceAmt + BHOPAL;
            else if (StationTo.equals("GOA")) totalAMT = ServiceAmt + GOA;
            else if (StationTo.equals("MUMBAI")) totalAMT = ServiceAmt + MUMBAI;
            else if (StationTo.equals("TAMIL-NADU")) totalAMT = ServiceAmt + TAMIL_NADU;
            else System.out.println("wrong Input Try Again");
        } else System.out.println("Inconect option selet \n Try again\n...................................");
    }

    void display() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("_____________________________________________________________________________");
        System.out.println("congratulations hear is your ticket");
        System.out.println("Name = " + name + "\n" + "Mobile Number = " + mobNo + "\n" + "Your Travel Coach = " + coach);
        System.out.println("Station Form = Delhi " + "\n" + "Station To = " + StationTo);
        System.out.println("Amount - serviceAmt = " + ServiceAmt + " + " + "TravelAmt = " + StationTo);
        System.out.println("TotalAmt = " + totalAMT);

    }

    public static void main(String[] args) {
        Oops92 call = new Oops92();
        call.accept();
        call.update();
        call.display();

    }
}




/*
package Pra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Try {

    private String name;
    private long mobNo;
    private String coach;
    private String stationTo;
    private int serviceAmt;
    private int travelAmt;
    private int totalAmt;

    // Constants for service amounts based on coach type
    private static final Map<String, Integer> COACH_SERVICE_AMOUNTS = new HashMap<>();
    private static final Map<String, Integer> TRAVEL_AMOUNTS = new HashMap<>();

    static {
        COACH_SERVICE_AMOUNTS.put("FIRST-AC", 700);
        COACH_SERVICE_AMOUNTS.put("SECOND-AC", 500);
        COACH_SERVICE_AMOUNTS.put("THIRD-AC", 250);
        COACH_SERVICE_AMOUNTS.put("SLEEPER", 100);

        TRAVEL_AMOUNTS.put("AGRA", 100);
        TRAVEL_AMOUNTS.put("BHOPAL", 200);
        TRAVEL_AMOUNTS.put("GOA", 300);
        TRAVEL_AMOUNTS.put("MUMBAI", 400);
        TRAVEL_AMOUNTS.put("TAMIL-NADU", 500);
    }

    // Validates if the input option is among the allowed ones
    private String validateOption(String input, Map<String, Integer> validOptions) {
        input = input.toUpperCase();
        if (!validOptions.containsKey(input)) {
            System.out.println("Invalid option selected. Please try again.");
            System.exit(1);
        }
        return input;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your mobile number: ");
        mobNo = sc.nextLong();
        sc.nextLine(); // clear newline

        System.out.print("Choose coach (First-AC, Second-AC, Third-AC, Sleeper): ");
        coach = validateOption(sc.nextLine(), COACH_SERVICE_AMOUNTS);

        System.out.print("Choose destination (Agra, Bhopal, Goa, Mumbai, Tamil-Nadu): ");
        stationTo = validateOption(sc.nextLine(), TRAVEL_AMOUNTS);
    }

    public void update() {
        serviceAmt = COACH_SERVICE_AMOUNTS.get(coach);
        travelAmt = TRAVEL_AMOUNTS.get(stationTo);
        totalAmt = serviceAmt + travelAmt;
    }

    public void display() {
        System.out.println("_____________________________________________");
        System.out.println("Your Railway Ticket");
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobNo);
        System.out.println("Coach: " + coach);
        System.out.println("Station From: Delhi");
        System.out.println("Station To: " + stationTo);
        System.out.println("Service Charge: " + serviceAmt);
        System.out.println("Travel Cost: " + travelAmt);
        System.out.println("Total Cost: " + totalAmt);
        System.out.println("_____________________________________________");
    }

    public static void main(String[] args) {
        Pra.Try ticket = new Pra.Try();
        ticket.accept();
        ticket.update();
        ticket.display();
    }
}
*/
