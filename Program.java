import java.util.Scanner;

public class Program7{
    public static void main(String[] args){
        Scanner survey = new Scanner(System.in);
        
        System.out.print("Enter schrute-bucks: ");
        int sBucks = survey.nextInt();
        System.out.print("Enter klevins: ");
        int klevins = survey.nextInt();
        System.out.print("Enter stanley-nickels: ");
        double sNickels = survey.nextDouble();
        
        final int KperSB = 20;
        final int SNperK = 12;
        final int SNperSB = 100;
        
        sNickels += (klevins * ((double)SNperK));
        sNickels *= ((double)SNperSB / (SNperK * KperSB)); 
        double decimalSBucks = (sNickels / 100.0) + sBucks;
        
        System.out.printf("Decimal schrute-bucks = $%.2f", decimalSBucks);
    }
}
