import java.util.Scanner;


public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the corresponding number for a shape" + "\n" + "1.Rectangle" + "\n" + "2.Circle");
        
        // Let user choose the shape and created variables for the shapes
        int input, rectangle, circle;
        input = sc.nextInt();
        rectangle = 1;
        circle = 2;

        // create a conditional statements to select the calculation for that shape
        if (input == rectangle) {
        // Let user input the length and weidth of the rectangle
        System.out.println("Please enter lenght of the rectangle");
        double lenght = sc.nextDouble();

        System.out.println("Please enter weidth of the rectangle");
        double weidth = sc.nextDouble();
        
        // Store the area and perimeter formula in the variables and output the rounded up result
        double area = weidth*lenght;
        double perimeter = lenght*2+weidth*2;
        System.out.println("When one side is " + lenght + " and the other side is " + weidth + "," + " the area is " + Math.round(area) + " and the perimeter is " + Math.round(perimeter) + ".");
        
        }else if (input == circle){
        // Set the type of variables to double
        double circumference, area, r;

        // Let user enter the input and store the input and formula into a variable
        System.out.println("Please enter the radius for a circle");
        r = sc.nextDouble();

        circumference = 2 * Math.PI * r;
        area = Math.PI* Math.pow(r, 2);

        System.out.println("When the radius is " + r + " the circumference is " + Math.round(circumference) + " and the area is " + Math.round(area));

        }else{
            System.out.println("Error");
        }
    }
}

