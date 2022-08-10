import java.util.Scanner;
public class CircleStat{
    public static void main(String[] args) {
        // Create a new scanner for user to input
        Scanner sc = new Scanner(System.in);

        // Set the type of variables to double
        float circumference, area, r;

        // Let user enter the input and store the input and formula into a variable
        System.out.println("Please enter the radius for a circle");
        r = sc.nextFloat();

        circumference = 2 * Math.PI * r;
        area = Math.PI* Math.pow(r, 2);

        System.out.println("When the radius is " + r + " the circumference is " + Math.round(circumference) + " and the area is " + Math.round(area));

    }
}