import java.util.Scanner;
public class FindPluses {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String delimtedData;
        int i;
        int freqOccured = 0;
        delimtedData = scnr.nextLine();

        for(i = 0; i < delimtedData.length(); i++){
            if(delimtedData.charAt(i) == '+'){
                freqOccured++;
                System.out.println("Plus found at index " + i);
            }
        }
        System.out.println("Plus occurs " + freqOccured + " times");
    }
}
