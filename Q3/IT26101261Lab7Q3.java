
import java.util.Scanner;

public class IT26101261Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println(" Customer " + customer);
            
            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();
            
            System.out.print("Enter mode of payment (C for Cash / O for Other): ");
            char paymentMode = input.next().charAt(0);
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                double amountToPay = billAmount - discount;
                
                System.out.println("Bill Amount: " + billAmount);
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be Paid: " + amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("Bill Amount: " + billAmount);
                System.out.println("No discount applicable");
                System.out.println("Amount to be Paid: " + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}