import java.util.Scanner;

public class Star {
  public static void main(String[] args){

    //Intro
    System.out.println("The Star Triangle");
    System.out.println("Made By The GOAT, Daddy Rushil");

    //Initialization
    Scanner rush = new Scanner(System.in);
    System.out.println("Please enter a number less than 20:");
    int number = rush.nextInt();
    int stars = 0;

    //The Real Juicy Stuff
    if (number <= 20)
    {
        for (int lines = number; lines >= 1; lines--)
        {
            for (int iterations = 0; iterations <= stars; iterations++)
            {
                System.out.print("*");
            }
            stars = stars + 1;
            System.out.println();
        }
    }
    else
    {
        System.out.println("Error: your number was greater than 20.");
    }
    
  }
}