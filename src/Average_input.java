
import java.util.Scanner;
public class Average_input {
    public static void main(String[]arg){
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        num1 = scnr.nextInt();
        num2  = scnr.nextInt();
        num3 = scnr.nextInt();
        num4  = scnr.nextInt();

        int ProductofNums;
        int AverageofNums;

        ProductofNums = num1 * num2 * num3 * num4;
        AverageofNums = (num1 + num2 + num3 + num4 ) / 4;

        System.out.println("Product of Nums: " + ProductofNums);
        System.out.println("Average of Nums: " + AverageofNums);

        // part2
        double ProductFloat;
        double AverageFloat;

        ProductFloat = (double) num1 * num2 * num3 * num4;
        AverageFloat = (num1 + num2 + num3 + num4 )/ 4.0;

        System.out.printf("%.3f", ProductFloat);
        System.out.printf("%.3f", AverageFloat );

    }
}
