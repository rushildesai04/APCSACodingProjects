import java.util.Scanner;

public class Minimum {
  public static void main(String[] args){
    
    //Intro
    System.out.println("Minimum Number Calculator");
    System.out.println("Made By The GOAT, Daddy Rushil");
    Scanner rush = new Scanner(System.in);

    //Input and Initialization
    System.out.println("Please enter 5 numbers:");
    int num1 = rush.nextInt();
    int num2 = rush.nextInt();
    int num3 = rush.nextInt();
    int num4 = rush.nextInt();
    int num5 = rush.nextInt();
    int lowest;

    //Smallest Number Comparison Between 1 and 2
    if (num1 < num2 )
    {
      lowest = num1;
    }
    else
    {
      lowest = num2;
    }

    //Smallest Number Comparison Between 2 and 3
    if (num2 < num3 )
    {
      lowest = num2;
    }
    else
    {
      lowest = num3;
    }

    //Smallest Number Comparison Between 3 and 4
    if (num3 < num4 )
    {
      lowest = num3;
    }
    else
    {
      lowest = num4;
    }

    //Smallest Number Comparison Between 4 and 5
    if (num4 < num5 )
    {
      lowest = num4;
    }
    else
    {
      lowest = num5;
    }

    //Output 
    System.out.println("The minimum numbet is " + lowest + ".");

    //Code Used When Writing and Testing Code
    //System.out.println(num1); System.out.println(num2); System.out.println(num3); System.out.println(num4); System.out.println(num5); System.out.println(lowest);
  }
}