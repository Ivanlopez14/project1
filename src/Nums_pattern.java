import java.util.Scanner;
public class Nums_pattern {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}