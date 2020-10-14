import java.util.Scanner;

public class Time {
  public static void main(String[] args){
    
    System.out.println("\nTime converter thing");
    System.out.println("Made by the GOAT, Daddy Rushil\n");
    
    Scanner time = new Scanner(System.in);
    int input;
    int weeks;
    int days;
    int hours;
    int minutes;
    int seconds;
    int placeholder1;
    int placeholder2;
    int placeholder3;
    
    //One week is equal to 608400 seconds//
    //One day is equal to 86400 seconds//
    //One hour is equal to 3600 seconds//
    //One minute is equal to 60 seconds//
    
    System.out.println("Please enter the number of seconds.");
    input = time.nextInt();
    weeks = input / 604800;
    placeholder1 = input % 604800;
    days = placeholder1 / 86400;
    placeholder2 = placeholder1 % 86400;
    hours = placeholder2 / 3600;
    placeholder3 = placeholder2 % 3600;
    minutes = placeholder3 / 60;
    seconds = placeholder3 % 60;
    
    System.out.println(input + " seconds = "+ weeks +" weeks "+ days + " days " + hours + " hours " + minutes + " minutes and " + seconds + " seconds");
    
  }
}
