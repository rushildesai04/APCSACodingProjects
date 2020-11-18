import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args){

    //Intro
    System.out.println("The Palindrome Recognizer");
    System.out.println("Made By The GOAT, Daddy Rushil");

    //Initialization
    Scanner rush = new Scanner(System.in);
    System.out.println("Please enter a word, phrase, or sentence");
    String str = new String(rush.nextLine());
    String resultStr = new String("");
    String oppositeStr = new String("");
    String character;
    
    //Configure Input
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++)
    {
        character = str.substring(i,i+1);
        if (!(character.equals(" ")) && ((character.compareTo("a") >= 0) && character.compareTo("z") <= 0))
        {
            resultStr = resultStr + str.substring(i,i+1);
        }
    }

    //Backwards Input
    for (int j = str.length(); j > 0; j--)
    {
        character = str.substring(j-1,j);
        if (!(character.equals(" ")) && ((character.compareTo("a") >= 0) && character.compareTo("z") <= 0))
        {
            oppositeStr = oppositeStr + str.substring(j-1,j);
        }
    }

    //Compare Strings and Output
    if (resultStr.equals(oppositeStr))
    {
        System.out.println("\"" + str + "\"" + " is a palindrome.");
    }
    else
    {
        System.out.println("\"" + str + "\"" + " is not a palindrome.");
    }
  }
}
