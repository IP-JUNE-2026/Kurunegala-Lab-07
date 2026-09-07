import java.util.Scanner;
public class it26101404Lab7Q1B{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double Total = 0.0;
        double Average =0.0;
        String result;
    
        for(int j = 1 ; j <=3; j++){  
            System.out.println("Student "+ j);  
            
            System.out.println("Enter Marks : ");  
            Total = input.nextDouble() + input.nextDouble() + input.nextDouble() + input.nextDouble();
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
}