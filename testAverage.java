import java.util.Scanner;

public class testAverage {
    public static void main (String []args){
        
        int testScore1;
        int testScore2;
        int testScore3;
        int average;
        
      
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("what is your test score? ");
        testScore1 = keyboard.nextInt();
        
        System.out.print("what is your test score? ");
        testScore2 = keyboard.nextInt();
        
        System.out.print("what is your test score? ");
        testScore3 = keyboard.nextInt();
          
          average = ((testScore1 + testScore2 + testScore3) / 3);
          
          System.out.println(average);
        
    }
    
}
