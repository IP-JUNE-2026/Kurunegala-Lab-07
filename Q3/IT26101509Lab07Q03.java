import java.util.Scanner;
public class IT26101509Lab07Q03{
public static void main (String[] args){
	int i =1;
	double total_bill;
Scanner input=new Scanner(System.in);
	
	while (i <=5)
	{
		System.out.println("customer "+i);
		System.out.print("Enter the total bill: " );
		total_bill=input.nextDouble();
		
		System.out.print("Enter mode of payment (C for cash , O for other): ");
		char type =input.next().charAt(0);
		if (type=='c' || type=='C')
		{Double discount=total_bill/100*5.0;
		total_bill=total_bill-discount;
		System.out.println("Discount is : "+discount);
		System.out.println("Amount to be paid: "+total_bill);
		}
		else if (type=='o'||type=='O')
		{
			System.out.println("NO discount applicable");
			System.out.println("Amoung to be payid :"+total_bill);
		}
		else
		{
			System.out.println("paymant mode is not avaleble !");

		}
System.out.println();		
i=i+1;
	}		
}
}