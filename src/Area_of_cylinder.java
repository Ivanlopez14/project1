import java.util.Scanner;
public class Area_of_cylinder {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Cylinder Height: ");
        double cylinderHeight = scnr.nextDouble();

        System.out.println("Cylinder Radius: ");
        double cylinderRadius = scnr.nextDouble();
        double Area = (2.0) * (3.14) * (cylinderRadius * cylinderHeight + cylinderRadius * cylinderRadius);

        System.out.printf("%.2f\n", Area);


    }
}
