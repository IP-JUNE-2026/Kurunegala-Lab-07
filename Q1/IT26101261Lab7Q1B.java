
import java.util.Scanner;

public class IT26101261Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            
            int sub1 = input.nextInt();
            int sub2 = input.nextInt();
            int sub3 = input.nextInt();
            int sub4 = input.nextInt();

            double average = (sub1 + sub2 + sub3 + sub4) / 4.0;

            System.out.println("Average is : " + average);
			
              if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is : Distinction");
            } 
            else if (average >= 50 && average <= 74) {
                System.out.println("Overall Grade is : Credit");
            } 
            else if (average >= 0 && average <= 49) {
                System.out.println("Overall Grade is : Fail");
            } 
            else {
                System.out.println("Overall Grade is : Invalid");
            }

            System.out.println(); 
        }
    }
}
