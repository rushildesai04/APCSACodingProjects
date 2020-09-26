import java.util.Scanner;

public class Change {

    public static void main(final String[] args) {
        System.out.println("\nA Change Machine");
        System.out.println("Made by the GOAT, Daddy Rushil\n");
        Scanner change = new Scanner(System.in);

        System.out.println("Please Enter the Cost of the Item:");
        double input = change.nextDouble();
        System.out.println("Please Enter the Amount Paid:");
        double paid = change.nextDouble();
        double owed = (paid * 100) - (input * 100);
        double owedExact = owed / 100 ;

        int numPennies = (int) ((owedExact + 0.005)*100);
        int quartersLeft = numPennies / 25;
        int remaining = numPennies % 25;
        int dimesLeft = remaining / 10;
        int remaining1 = remaining % 10;
        int nickelsLeft = remaining1 / 5;
        int penniesLeft = remaining1 % 5;

       System.out.println("Change Owed: " + owedExact);
       System.out.println("Quarters: " + quartersLeft);
       System.out.println("Dimes: " + dimesLeft);
       System.out.println("Nickels: " + nickelsLeft);
       System.out.println("Pennies: " + penniesLeft);
       





        
        

        


   }  
}
