import java.util.Scanner;
public class cars {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);

        int numofCars;
        System.out.println("How many cars do u have ");
        numofCars = scnr.nextInt();

        if(numofCars > 10){
            System.out.println("Wow, you are so rich");
        } else if (numofCars < 10) {
            System.out.println("ok, so you're poor");
        }else{
            System.out.println("Nice");
        }

    }
}
