//Made by Rushil Desai

import java.util.Scanner;

public class HiddenWord
{
    //Private Variables
    private String word;

    //Constructor Method
    public HiddenWord(String input)
    {
        word = input.toUpperCase();
    }

    //Hint Method
    public String getHint(String guess)
    {
        String result = new String("");
        guess = guess.toUpperCase();
        if (word.length() == guess.length())
        {
            for (int i = 0; i < guess.length(); i++)
            {
                if (word.substring(i,i+1).equals(guess.substring(i,i+1)))
                {
                    result = result + guess.substring(i,i+1);
                }
                else
                {
                    int temp = 0;
                    for (int j = 0; j < word.length(); j++)
                    {
                        if (word.substring(j,j+1).equals(guess.substring(i,i+1)))
                        {
                            temp = 1;
                            break;
                        }
                    }
                    if (temp == 1)
                    {
                        result = result + "+";
                    }
                    else
                    {
                        result = result + "*";
                    }
                }
            }
        }
        else
        {
            result = "Error: Length of guess is not the same as the length of the word.";
        }
        return result;
    }

    //Main Method
    public static void main(String[] args)
    {
        Scanner rush = new Scanner(System.in);
        boolean guessed = false;

        System.out.println("Enter a Word:");
        String word = new String(rush.nextLine());
        word = word.toUpperCase();
        HiddenWord game = new HiddenWord(word);

        System.out.println("Enter your guesses:");
        while (guessed == false)
        {
            String guess = new String(rush.nextLine());
            guess = guess.toUpperCase();
            String result = new String(game.getHint(guess));
            if (result.equals(guess))
            {
                System.out.println("Yes, You have found the word!");
                guessed = true;
            }
            else
            {
                System.out.println(result);
            }
  
        }
    }
}