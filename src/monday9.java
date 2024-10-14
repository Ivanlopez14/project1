import java.util.Scanner;
public class monday9 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userAgeYear;
        int userAgeDay;
        int userAgeMins;

        System.out.println("Enter youyr age in years: ");

        userAgeYear = scnr.nextInt();
        userAgeDay = userAgeYear * 365;
        userAgeDay = userAgeDay + (userAgeYear / 4);
        userAgeMins = userAgeDay * 24 * 60;

        System.out.println("You are " + userAgeDay + "days old.");
        System.out.println("You are " + userAgeMins + "minutes old.");

    }
}
