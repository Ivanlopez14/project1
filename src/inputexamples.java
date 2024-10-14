import java.util.Scanner;
public class inputexamples {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int birthMonth;
        int birthYear;
        /* Your solution goes here */
        System.out.println("Your birth month: ");
        birthMonth = scnr.nextInt();

        System.out.println("Your birth year");
        birthYear = scnr.nextInt();
        System.out.print( birthMonth + "/" + birthYear);
    }
}