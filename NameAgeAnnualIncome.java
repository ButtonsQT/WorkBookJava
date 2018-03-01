
package nameageannualincome;
import java.util.Scanner;
public class NameAgeAnnualIncome {


    public static void main(String[] args) {
     
        String name;
        int age;
        double annualPay;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("what is your age? ");
        age = keyboardInput.nextInt();
        
        System.out.print("what is annual income? ");
        annualPay = keyboardInput.nextDouble();
        
       keyboardInput.nextLine();
        
        System.out.print("what is your name? ");
        name = keyboardInput.nextLine();
         
        

        
        System.out.print("My name is " + name+ 
                ", "+" my age is " + age+
                " I hope to earn "+ annualPay + "per year"
          );
        
    }
    
}
