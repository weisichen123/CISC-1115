import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {

        // Three double variables to store the first, second number and the result
        Double number1, number2, result;
        // char varibale to store the operator
        char operator;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // create a infinity loop till the user end the program manually
        while(true){
            // ask for the first number
            System.out.println("Please enter first number (Enter 0 to end the program)");
            // input the first number and store it into double variable
            number1 = sc.nextDouble();
            // if the first number input is 0, the program will be end
            if(number1 == 0){
                System.out.println("Thank you");
                break;
            }

            // ask for the operator
            System.out.println("Please choose an operator: +, -, *, or /");
            // input operator as char type and store it into char variable
            operator = sc.next().charAt(0);

            // ask for the second number
            System.out.println("Please enter second number");
            // input the second number and store it into double variable
            number2 = sc.nextDouble();


            // use switch to 
            switch (operator) {

                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }

        }


    }
}
