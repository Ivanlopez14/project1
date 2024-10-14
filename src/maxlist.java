import java.util.Scanner;
public class maxlist {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int maxSoFar =0 ;
        int currValue;
        int numValue; // how much variable
        int i;

        System.out.print(" Enter the amount of variable in the list: ");
        numValue = scnr.nextInt();

        System.out.print("Numbers are: ");

        for( i = 0; i < numValue; i++){
            currValue = scnr.nextInt();

            if(i==0){
                maxSoFar = currValue;
            }
            else if(currValue > maxSoFar){
                maxSoFar = currValue;
            }
        }
        if( numValue > 0 ){
            System.out.print("Max is " + maxSoFar);
        }
    }
}
