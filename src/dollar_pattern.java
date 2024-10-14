import java.util.Scanner;
public class dollar_pattern {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        for(int i = 5; i >0; i--){
            for(int j = 0; i > j; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
