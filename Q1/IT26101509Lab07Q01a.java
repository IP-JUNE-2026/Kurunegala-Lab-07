import java.util.Scanner;

public class IT26101509Lab07Q01a{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter marks for four subjects:");
		
		System.out.print("Enter Subject Mark 1: ");
		int subject1 = input.nextInt();
		
		System.out.print("Enter Subject Mark 2: ");
		int subject2 = input.nextInt();
		
		System.out.print("Enter Subject Mark 3: ");
		int subject3 = input.nextInt();
		
		System.out.print("Enter Subject Mark 4: ");
		int subject4 = input.nextInt();
		
		System.out.println( );
		
		double average = ( subject1 + subject2 + subject3 + subject4) / 4.0;
		System.out.println("Average is : " +average);
		
		if (average >= 75 && average <= 100){
			System.out.println("Overall Grade is : Distinction");
		}
		else if (average >= 50 && average<= 74){
			System.out.println("Overall Grade is : Credit");
		}
		else if (average >= 0 && average <= 49){
			System.out.println("Overall Grade is : Fail");
		}
		else{
			System.out.println("Invalid marks entered!");
		}
	}
}	