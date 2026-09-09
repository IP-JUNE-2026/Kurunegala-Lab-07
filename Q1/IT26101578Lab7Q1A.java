import java.util.Scanner;
public class IT26101578Lab7Q1A{
	public static void main (String[] args){
    int marks;
	int total=0;
	double avarage ;
	Scanner input = new Scanner(System.in);
	for (int i=0;i<4;i++)
	{ System.out.print("enter the marks : ");
		marks =input.nextInt();
		total=total + marks;
		
		
	}
	avarage= total / 4.0;
	System.out.println("Avarage is :" +avarage  );
	
	if (avarage>=75)
	{ System.out.print("overall Grade is : Distinction");
	}
	else if( (avarage>=50) && ( 74 > avarage))
	{System.out.print("overall Grade is :Credit ");
	}
	else
	{System.out.print("overall Grade is :Fail ");

	}
		
		



	}
}