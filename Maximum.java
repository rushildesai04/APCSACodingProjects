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
    int loop = 1;
    
    //Maximum Number Test
    while (temporary == 1)
    {
        int number = rush.nextInt();
        if (number != 666)
        {
            if (loop == 1)
            {
                maxNumber = number;
                loop = loop + 1;
            }
            else
            {
                if (maxNumber < number)
                {
                    maxNumber = number;
                }
                loop = loop + 1;
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