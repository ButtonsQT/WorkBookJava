package age;

import java.util.Scanner;


public class Age {

  
    public static void main(String[] args) {
     
       int number; 
        Scanner age = new Scanner (System.in);
        
         
        System.out.print(" Enter your age ");
        number = age.nextInt();
        
        System.out.print("I am told you are atleast " + number);
    }
    
}
