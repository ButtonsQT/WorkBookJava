import javax.swing.JOptionPane;

public class malefemalepercentages {

    private static int numberOfFemales;
    public static void main(String[] args) {
        
        String inputString;
        int numberOfMales;
        int numberOfFemales;
       
        
          inputString = 
                JOptionPane.showInputDialog("how many men are in this class? ");
                numberOfMales = Integer.parseInt(inputString) ;
                
          inputString =        
                JOptionPane.showInputDialog("how many females are in this class? ");
        numberOfFemales = Integer.parseInt(inputString);
                 
        int total = numberOfFemales + numberOfMales;
                
        System.out.println("the total is " + total); 
        System.exit(0);
    }
    
}