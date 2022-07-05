import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class program1{
    public static void main(String[] args) throws Exception {
        File fe = new File("integer N.txt");
        Scanner sc = new Scanner(fe);
        PrintStream ps = new PrintStream("output.txt");

        // Create a while loop to scan the file
        while(sc.hasNext()){
            int N = sc.nextInt();

            // call out the Factorial method and print to the output file and the terminal
            ps.println("The factorial of " + N + " is " + factorial(N));
            System.out.println("The factorial of " + N + " is " + factorial(N));

            // call out the Sum of squares Method and print to the output file and the terminal
            ps.println("The sum of squares is " + soq(N));
            System.out.println("The sum of squares is " + soq(N));

            // call out the Fibonacci sequence Method and create a for loop to print the array to the output file and terminal
                for (int i = 1; i <= N; i++) {
                    System.out.print(fsq(i) + " ");
                    ps.print(fsq(i) + " " );
            }

            // Print a new line for organized the output
            ps.println("\n");
            System.out.println("\n");
        }
    }
    // Factorial Method
    public static int factorial(int n){
        if(n==1){
            return 1;
        } else if(n==0){
            return 0;
        }
        else{
            return n * factorial(n-1);
        }
    }

    // Sum of squares Method
    public static int soq(int n){
        if(n==0){
            return 0;
        }else{
            return soq(n-1) + (n*n);
        }
    }

    // Fibonacci sequence Method
    public static int fsq(int n){
        if(n<=1){
            return 1;
        }else{
            return fsq(n-1) + fsq(n-2);
            
        }
    }
}


