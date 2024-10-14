import java.util.Scanner;
public class calculator_as2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scnr.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scnr.nextDouble();

        System.out.println("Select the operation(such as: +,-,/,*)");
        char arithmetic = scnr.next().charAt(0);

        switch(arithmetic){
            case '+': System.out.println( num1 + num2);
                break;
            case '-': System.out.println( num1 - num2);
                break;
            case '*': System.out.println( num1 * num2);
                break;
            case '/': if( num2 == 0 ){
                System.out.println("Divison by zero error");
            }
            else{
                System.out.println( num1/ num2);
            }
                break;
            default:
                System.out.println("error");
        }
    }
}
