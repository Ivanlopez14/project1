
import java.util.Scanner;

public class example_2 {

    public static void main(String[] args){

       /* String x = "water";
        String y = "soda";
        String temp;

        temp= x;
        x= y;
        y =  temp;

        System.out.println("x:"+ x);
        System.out.println("y:"+ y);*/

        Scanner scnr = new Scanner(System.in);

        System.out.println("Print your name");
        String name = scnr.nextLine();

        System.out.println("Hello" + name );
    }

}
