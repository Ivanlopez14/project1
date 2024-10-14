import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userInput;
        System.out.println("Enter a number that less than 50: ");


        while(true){
            userInput = scnr.nextInt();
            if(userInput <50){
                System.out.println("You enter a valid number!" + userInput);
                break;
            }
            System.out.println("You enter an invalid number!");
        }
    }
}

