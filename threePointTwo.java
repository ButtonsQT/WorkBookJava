import javax.swing.JOptionPane;

public class threePointTwo {
    public static void main(String[] args) {
        
        int payRate;
        double overTime;
        String input;
        String totalPay;
       
        input = 
                JOptionPane.showInputDialog("how many hours have you worked?");
        int hours = Integer.parseInt(input);
        
        input =
         JOptionPane.showInputDialog("What is your " +
                                   "hourly pay rate? ");
        payRate = Double.parseDouble(input);
        
       if (hours > 40){
       overTime = (hours - 40) *1.5 ;
       double overtimePayRate = overTime + hours;
       double calculatedEquation = overtimePayRate + payRate;
         
       System.out.println("Your total pay with OVERTIME is" + calculatedEquation); 
       }
       else
            System.out.println("Your total pay is with out over time is" + totalPay);
    }
}
