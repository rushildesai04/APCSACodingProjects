import java.util.Scanner;


public class Triangle {
  public static void main(String[] args){

    //Intro
    System.out.println("Triangle Type Machine");
    System.out.println("Made By The GOAT, Daddy Rushil");
    Scanner rush = new Scanner(System.in);

    //Input in Coordinate Points
    System.out.println("Please enter the x and y coordiantes of point 1 (seperated by space)");
    double p1x = rush.nextDouble();
    double p1y = rush.nextDouble();

    System.out.println("Please enter the x and y coordiantes of point 2 (seperated by space)");
    double p2x = rush.nextDouble();
    double p2y = rush.nextDouble();

    System.out.println("Please enter the x and y coordiantes of point 3 (seperated by space)");
    double p3x = rush.nextDouble();
    double p3y = rush.nextDouble();

    //Distances (Legs) of the triangle
    double a = Math.sqrt(Math.pow((p2x-p1x),2) + Math.pow((p2y-p1y),2));
    double b = Math.sqrt(Math.pow((p3x-p2x),2) + Math.pow((p3y-p2y),2));
    double c = Math.sqrt(Math.pow((p1x-p3x),2) + Math.pow((p1y-p3y),2));

    //1 Equilateral Test
    if (Math.abs(a-b) < Math.pow(10,-6))
    {
      if (Math.abs(b-c) < Math.pow(10,-6))
      {
        if (Math.abs(c-a) < Math.pow(10,-6))
        {
          System.out.println("This is an equilateral triangle.");
        }
      }
    }
    //1 Scalene Test
    if (Math.abs(a-b) > Math.pow(10,-6))
    {
      if (Math.abs(b-c) > Math.pow(10,-6))
      {
        if (Math.abs(c-a) > Math.pow(10,-6))
        {
          System.out.println("This is an scalene triangle.");
        }
      }
    }
    //3 Isosceles Tests
    if (Math.abs(a-b) < Math.pow(10,-6))
    {
      if (Math.abs(b-c) > Math.pow(10,-6))
      {
        if (Math.abs(c-a) > Math.pow(10,-6))
        {
          System.out.println("This is an isosceles triangle.");
        }
      }
    }
    if (Math.abs(a-b) > Math.pow(10,-6))
    {
      if (Math.abs(b-c) > Math.pow(10,-6))
      {
        if (Math.abs(c-a) < Math.pow(10,-6))
        {
          System.out.println("This is an isosceles triangle.");
        }
      }
    }
    if (Math.abs(a-b) > Math.pow(10,-6))
    {
      if (Math.abs(b-c) < Math.pow(10,-6))
      {
        if (Math.abs(c-a) > Math.pow(10,-6))
        {
          System.out.println("This is an isosceles triangle.");
        }
      }
    }
    //Used During Testing
    //System.out.println(p1x); System.out.println(p1y); System.out.println(p2x); System.out.println(p2y); System.out.println(p3x); System.out.println(p3y);
    //System.out.println("\n" + a); System.out.println(b); System.out.println(c);
  }
}
