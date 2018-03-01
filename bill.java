/*
 Write a program that computes the tax and tip for a restaurant bill. 
User is to enter the total amount of the bill. Tax is 6.75% of the bill.
The tip is 15% of the meal after tax has been added. The meal charge, tax,
tip, and total should be printed on the screen.
 */

import javax.swing.JOptionPane;
public class bill {
    public static void main(String[] args) {
        String inputString;
        double tax;
        double tip = .15;
        double bill;
        
         inputString = 
                JOptionPane.showInputDialog("what was the bill amount?");
        bill = Integer.parseInt(inputString);
        tax = (bill * .0675);
        tip = bill/15.0;
     //   System.out.println(bill + tax+ tip);
       // System.out.println( "the tax is " + tax);
        System.out.println("the tip is " +tip);
       // System.out.println("the bill is " +bill);
    }
}
