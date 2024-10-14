import java.util.Scanner;
public class switch_rock_paper_checker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int nextChoice = scnr.nextInt();

        switch(nextChoice){
            case 0: System.out.println("Rock");
                break;
            case 1: System.out.println("Paper");
                break;
            case 2: System.out.println("Scissors");
                break;
            default: System.out.println("Unknown");
                break;
        }
    }
}
