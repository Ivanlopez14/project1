import java.util.Scanner;
public class math_method1 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("The value of x: ");
        double x = scnr.nextDouble();

        System.out.println("The value of y: ");
        double y = scnr.nextDouble();

        double z = Math.sqrt(x - Math.pow(y, 3));

        System.out.println("The value of z: \n" + z);

    }
}
