import java.util.Scanner;
public class math_method2 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("The value of x: ");
        double x = scnr.nextDouble();

        System.out.println("The value of y:");
        double y = scnr.nextDouble();

        double z = Math.sqrt(Math.abs(x) + Math.abs(y));
        System.out.println("The value of z: " + z);

    }
}
