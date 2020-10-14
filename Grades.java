import java.util.Scanner;

public class Grades {
  
   public static void main(String[] args){
     System.out.println("Weighted Average Calculator");
     System.out.println("Made by the GOAT, Rushil Desai");
     Scanner crip = new Scanner(System.in);
     int t1;
     int t2;
     int q1;
     int q2;
     int q3;
     int h1;
     double quizav;
     double testav;
     double fg;
     double tav;
     double qav;
     double hav;
     System.out.println("Please enter your test grades.");
     System.out.print("Test 1 >");
     t1 = crip.nextInt(); 
     System.out.print("Test 2 >");
     t2 = crip.nextInt();                   
     System.out.println("Please enter your quiz grades.");
     System.out.print("Quiz 1 >");
     q1 = crip.nextInt();
     System.out.print("Quiz 2 >");
     q2 = crip.nextInt();
     System.out.print("Quiz 3 >");
     q3 = crip.nextInt();
     System.out.println("Please enter your homeowrk score.");
     System.out.print("Homework >");
     h1 = crip.nextInt();
     testav = (double)(t1 + t2)/2 ;
     quizav = (double)(q1 + q2 + q3)/3 ;
     tav = testav * 0.5 ;
     qav = quizav * 0.3 ;
     hav = h1 * 0.2 ;
     fg = tav + qav + hav ;
     System.out.println("Test Average:" + testav);
     System.out.println("Quiz Average:" + quizav);
     System.out.println("Final Grade:" + fg);
  }
}
