import java.util.Scanner;

public class Tips {
  public static void main(String[] args){

    //Intro
    System.out.println("Restraunt Tip Calculator");
    System.out.println("Made By The GOAT, Daddy Rushil");
    Scanner rush = new Scanner(System.in);

    //Variable Initializations and Declarizations
    System.out.println("Please enter the dinner amount (up to 2 decimal places).");
    double amount = rush.nextDouble();
    System.out.println("Please enter the satisfaction level (1 – 3).");
    int level = rush.nextInt();

    //Correct Tip Amount
    double tipPercent;
    if (level == 1)
    {
        tipPercent = 0.20;
        System.out.println("Customer is totally satisfied.");
    }
    else if (level == 2)
    {
        tipPercent = 0.15;
        System.out.println("Customer is satisfied.");
    }
    else 
    {
        tipPercent = 0.10;
        System.out.println("Customer is dissatisfied.");
    }

    //Tip Calculations
    double tip = (amount * tipPercent)*100;
    tip = (int)tip;
    tip = tip / 100;
    
    //Total Cost Calculations
    double totalAmount = amount + tip;

    //Output Variables
    System.out.println("Dinner Amount = $" + amount);
    System.out.println("Tip Amount = $" + tip);
    System.out.println("Total Amount = $" + totalAmount);


    //Tests when Writing the Code
    //System.out.println(tip); System.out.println(tipPercent); System.out.println(level); System.out.println(amount);
    }
}
