import java.util.Scanner;
public class max_in_list {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int firstMax = 0;
        int currValue;
        int numValues;
        int i;

        System.out.print("Enter your amount of variable: ");
        numValues = scnr.nextInt();

        System.out.println("Numbers: ");

        for(i=0; i < numValues; i++){
            currValue = scnr.nextInt();

            if (i==0){
                firstMax = currValue;
            }
            else if(currValue > firstMax){
                firstMax = currValue;
            }
        }
        if(numValues > 0){
            System.out.println("Max: " + firstMax);
        }

    }
}