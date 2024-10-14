import java.util.Scanner;
public class sum_even {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.print("Enter the value of n: ");
        n = scnr.nextInt();

        for( int i = 1; i <= n; i++ ){
            sum = sum +( i * 2 );
        }

        System.out.println("Sum of first " + n + " number is: " + sum);
    }
}
