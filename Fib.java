import java.util.Scanner;

public class Fib {
  public static void main(String[] args){

    //Intro
    System.out.println("Fibonacci Sequence");
    System.out.println("Made By The GOAT, Daddy Rushil");
    Scanner rush = new Scanner(System.in);

    //Initialization
    int firstNum = 0;
    int secondNum = 0;
    int thirdNum = 0;
    int fib = 0;
    int count = 1;

    //Fibbonaci Sequence Calculations
    while(count <= 45)
    {
      firstNum = secondNum;
        if (count == 2)
        {
          firstNum = 1;
        }
        secondNum = fib;
        fib = firstNum + secondNum;
        System.out.print(fib + " ");
        if (count % 5 == 0) 
        {
          System.out.println();
        }
        count++;
    }


  }
}