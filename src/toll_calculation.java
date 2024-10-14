import java.util.Scanner;
public class toll_calculation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int  timeHours;
        int timeMins;
        int inputColon; // find the location of :
        String userInput;
        double tollAmount;

        System.out.println("Enter time travel (24 hour format): ");

        userInput = scnr.next();
        inputColon = userInput.indexOf(":");
        timeHours = Integer.parseInt(userInput.substring(0, inputColon)); // convert string hour before : to integer
        timeMins = Integer.parseInt(userInput.substring(inputColon + 1, userInput.length() )); // convert min after : to integer

        if(timeHours < 6 ){
            tollAmount = 1.55;
        }
        else if(timeHours < 10 ){
            tollAmount = 4.65;
        }
        else if(timeHours < 18 ){
            tollAmount = 2.35;
        }
        else{
            tollAmount = 1.55;
        }

        System.out.print("Toll at " + timeHours + ":");
        System.out.print(String.format("%02d" , timeMins));
        System.out.print(" is " + tollAmount);
    }
}
