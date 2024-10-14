import java.util.Scanner;
public class Pluses2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String delimitedData;
        int i;
        int freqOccured = 0;

        delimitedData = scnr.next();

        for( i =0; i < delimitedData.length(); i++){
            if(delimitedData.charAt(i) == '+'){
                freqOccured ++;
                System.out.println("Plus found at Index of: " + i);
            }
        }
        System.out.println("Plus occurs " + freqOccured + " times.");
    }
}
