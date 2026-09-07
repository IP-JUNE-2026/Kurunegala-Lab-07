import java.util.Scanner;

public class IT26101774Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {

            System.out.print("Enter bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {

                double discount = bill * 0.05;
                double amount = bill - discount;

                System.out.println("Discount = " + discount);
                System.out.println("Amount to be paid = " + amount);
            }
            else if (mode == 'O' || mode == 'o') {

                System.out.println("Discount = 0.0");
                System.out.println("Amount to be paid = " + bill);
            }
            else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}