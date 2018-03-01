
package nameandinitals;

public class NameAndInitals {

    public static void main(String[] args) {
    
        //,lastName,middleName;
     
       char firstInital;
       String firstName = "Pearl";
       firstInital = firstName.charAt(0);
               
       char lastInital;
       String lastName = "Mendoza";
       lastInital = lastName.charAt(0);
       
       char middleInital;
       String middleName = "Leonella";
       middleInital = middleName.charAt(0);
        
        System.out.println( firstInital + " " + middleInital + " " + lastInital +
                          " "+ firstName + " " + middleName + " " + lastName );
        
    }
}
