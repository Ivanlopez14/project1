import java.util.Scanner;
public class User_ages {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userAgeYears;
        int userAgeDays;
        int userAgeMin;
        System.out.print("Enter your age in years: ");

        userAgeYears = scnr.nextInt();
        userAgeDays = userAgeYears * 365;
        userAgeDays = userAgeDays + (userAgeYears /4);
        userAgeMin = userAgeDays * 24 * 60;


        System.out.println("You are " + userAgeDays + " days old.");
        System.out.println("You are " + userAgeMin + " minutes old.");
    }


}