/**
An electronics company sells circuit boards at a 40 percent profit, If you know 
* the retail price of a circuit board, you can calculate its profit with the
* following formula:
Profit = Retail price x 0.4
Write a program that asks the user for the retail price
* of a circuit board calculates the amount of profit earned 
* for that product, and displays the result on the screen.
 */
import javax.swing.JOptionPane;
public class circuitBoardProfit {
    public static void main(String[] args)      
    {
       String inputString;
       double retailPrice;
       double profit;
       //= retailPrice * 0.4;  
       inputString = 
                JOptionPane.showInputDialog("what was the retail price?");
        retailPrice = Integer.parseInt(inputString);
        profit = (retailPrice * 0.4);
        
       
       
       System.out.println("the profit for this device is " + profit);
       System.exit(0);
    }
         
}
