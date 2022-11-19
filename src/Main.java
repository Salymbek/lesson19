import packpage1.Week;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String week = scanner.nextLine();


        switch (week){
            case "MONDAY":
                System.out.println( Week.MONDAY.getDesignation());
                break;
            case "TUESDAY":
                System.out.println( Week.TUESDAY.getDesignation());
                break;
            case "WEDNESDAY":
                System.out.println(Week.WEDNESDAY.getDesignation());
                break;
            case "THURSDAY":
                System.out.println(Week.THURSDAY.getDesignation());
                break;
            case "FRIDAY":
                System.out.println(Week.FRIDAY.getDesignation());
                break;
            case "SATURDAY":
                System.out.println(Week.SATURDAY.getDesignation());
                break;
            case "SUNDAY":
                System.out.println(Week.SUNDAY.getDesignation());
                break;
            default:
                System.out.println("МЫНДАЙ КУН ЖОК");
                break;
        }





    }
}