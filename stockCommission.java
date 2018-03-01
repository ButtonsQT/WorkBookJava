
public class stockCommission {
    public static void main(String[] args) {
        int amountPaidForStock;
        
       
        double stockPrice = 21.77;
                int stockBought = 600;

                double totalAmountPaid = stockPrice * stockBought;
                double amountOfCommission = totalAmountPaid * .02;
        
        System.out.println("the amount paid for the stock is " + totalAmountPaid);
        System.out.println("the commission " + amountOfCommission);
        
                System.out.println("the amount paid "+ totalAmountPaid
                                    + amountOfCommission);

    }
}
