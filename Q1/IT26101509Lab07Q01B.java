
import java.util.Scanner;

public class IT26101509Lab07Q01B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int student = 1; student <= 3; student++) {

			System.out.println("Student " + student );
            System.out.println("Enter marks : ");
			
            int sub1 = input.nextInt();
            int sub2 = input.nextInt();
            int sub3 = input.nextInt();
            int sub4 = input.nextInt();
            
            double average = (sub1 + sub2 + sub3 + sub4) / 4.0;
            System.out.println();
            System.out.println("Average is : " + average);
			System.out.print("Overall Grade is : ");
            
            if (average >= 75 && average <= 100) {
                System.out.println("Distinction");
            } else if (average >= 50 && average <= 74) {
                System.out.println("Credit");
            } else if (average >= 0 && average <= 49) {
                System.out.println("Fail");
            } else {
                System.out.println("Invalid");
            }
            System.out.println();
        }
    }
}