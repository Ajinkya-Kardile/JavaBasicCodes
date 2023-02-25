import java.util.Scanner;

public class FibonacciSeries{

    private static int count, n1 = 0, n2 = 1, n3;


    // Fibonacci Series using recursion
    private static void Print_Fibonacci_Series(int count){
        if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(n3+" "); 

            Print_Fibonacci_Series(count-1);
        }    
    }

    // Fibonacci Series without using recursion
    private static void PrintSeries(int count){
        for(int i=0; i<count; i++){
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(n3+" "); 
        }
    }


    public static void main(String args[]){

        System.out.println("Enter count of Fibonacci");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        Print_Fibonacci_Series(count);

        PrintSeries(count);
    }
}
