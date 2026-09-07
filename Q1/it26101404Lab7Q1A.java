import java.util.Scanner;
public class it26101404Lab7Q1A{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double Total = 0.0;
        double Average =0.0;
        String result;
        for(int i=1; i<=4;i++){
            System.out.print("Enter Subject Mark "+i+" : ");
            Total += input.nextDouble();
        }
        Average = Total / 4;
    
            System.out.println("\nAverage is : "+Average);

        if(Average<50){
            result="Fail";
        }else if(Average<75){
			result="Credit";
		}else{
			result = "Distinction";
		}

        System.out.println("Overall Grade is: "+result);
    }
}