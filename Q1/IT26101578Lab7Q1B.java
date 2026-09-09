import java.util.Scanner;
public class IT26101578Lab7Q1B{
public static void main (String[] args){
int total=0;
double average;
Scanner input = new Scanner(System.in);
int i=1;
while  (i <= 3)
{System.out.println("student " +i);
System.out.print("enter the marks : ");
int mark1=input.nextInt();
int mark2=input.nextInt();
int mark3=input.nextInt();
int mark4=input.nextInt();	

average=(mark1 + mark2 + mark3 + mark4)/4.0;
System.out.println("Avarage is :" +average  );

if (average>=75)
	{ System.out.print("overall Grade is : Distinction");
	}
	else if( (average>=50) && ( 74 > average))
	{System.out.print("overall Grade is :Credit ");
	}
	else
	{System.out.print("overall Grade is :Fail ");

	}
i=i+1;
System.out.print("\n ");
}
}
}