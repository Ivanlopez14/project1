import java.util.Scanner;

public class practice_10 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int nums  = 8;
        int tempVal;

        int[] userVals = new int[nums];

        System.out.println("Enter eight numbers: ");

        for(int i =0; i < userVals.length; i++){
            System.out.print("Values: ");
            userVals[i] = scnr.nextInt();
        }
        for(int i = 0; i < (userVals.length/2); i++){
            tempVal = userVals[i];
            userVals[i] = userVals[userVals.length -1 - i];
            userVals[userVals.length -1 - i] = tempVal;
        }
        System.out.println("\nNew value: ");
        for(int i =0; i < userVals.length; i++){
            System.out.println(userVals[i] +" ");
        }
    }
}
