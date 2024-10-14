import java.util.Scanner;
public class Array_p1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the array size");
        int size= scnr.nextInt();
        int number[] = new int[size];

        //input
        System.out.println("Enter your numbers");
        for(int i = 0; i < number.length; i++){
            number[i] = scnr.nextInt();
        }

        System.out.println("What number are you looking for: ");
        int targetNum = scnr.nextInt();
        for(int i = 0; i < number.length; i++) {
            if (number[i] == targetNum) {
                System.out.println("target found at index:" + i);
            }
            else {
                System.out.println("not found it!");
            }

        }
    }
}