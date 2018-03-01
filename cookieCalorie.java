/*Image result for cookie calories java
Cookie Calories - Java. A bag of cookies holds 40 cookies. The calorie 
information on the bag claims that there are 10 servings in the bag and 
that a serving equals 300 calories. Write a program that lets the user 
enter the number of cookies he or she actually ate and then reports the
number of total calories consumed.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author findl
 */
public class cookieCalorie {
    public static void main (String[] args)
    {
        String inputString;
       // int bagOfCookies = 40;
        int caloriesConsumed;
        int servingFourCookies = 75; // 4cookies are 75 calories each
        int consumed;
        
        inputString = 
                JOptionPane.showInputDialog("how many cookies did you eat?");
        consumed = Integer.parseInt(inputString);
        caloriesConsumed = (consumed * servingFourCookies);
        System.out.println("you have eaten a total of " + caloriesConsumed +
                            " calories");
        
        System.exit(0);
        
        
        
    }
    
}
