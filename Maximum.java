import java.util.Scanner;

public class Maximum {
  public static void main(String[] args){

    //Intro
    System.out.println("Maximum Number Calculator");
    System.out.println("Made By The GOAT, Daddy Rushil");
    Scanner rush = new Scanner(System.in);

    //Initialization
    System.out.println("Please enter an integer (Enter 666 to stop typing numbers):");
    int temporary = 1;
    int maxNumber = 0;
    
    //Maximum Number Test
    while (temporary == 1)
    {
        int number = rush.nextInt();
        if (number != 666)
        {
            if (number == 1)
            {
                maxNumber = number;
            }
            else
            {
                if (maxNumber < number)
                {
                    maxNumber = number;
                }
            }
        }
        else
        {
            temporary = 0;
        }
    }

    //Output
    System.out.println("The maximum number is " + maxNumber);

  }
}