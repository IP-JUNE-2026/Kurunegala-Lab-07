import java.util.Scanner;

public class it26101404Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; ++i) {
            int bill;
            double discount, Total;
            discount = 0;
            char method;
            System.out.println("Customer " + i);
            System.out.print("Enter the total bill amount: ");
            bill = input.nextInt();
            System.out.print("Enter mode of payment (C for Cash, O for Other): ");
            method = input.next().charAt(0);
            method = Character.toLowerCase(method);
            if (method != 'c' && method != 'o') {
                System.out.println("Payment Method is not valid\n");
                continue;
            }
            if (method == 'c') {
                discount = (bill / 100.0) * 5; 
            }
            Total = bill - discount;
            System.out.println("Amount to be paid: " + Total + "\n");
        }
        input.close();
    }
}