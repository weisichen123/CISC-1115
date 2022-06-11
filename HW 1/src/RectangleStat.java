import java.util.Scanner;
public class RectangleStat {
    public static void main(String[] args) {
        // Create a new scanner for user to input
        Scanner sc = new Scanner(System.in);

        // Let user input the length and weidth of the rectangle
        System.out.println("Please enter lenght of the rectangle");
        double lenght = sc.nextDouble();

        System.out.println("Please enter weidth of the rectangle");
        double weidth = sc.nextDouble();
        
        // Store the area and perimeter formula in the variables and output the rounded up result
        double area = weidth*lenght;
        double perimeter = lenght*2+weidth*2;
        System.out.println("When one side is " + lenght + " and the other side is " + weidth + "," + " the area is " + Math.round(area) + " and the perimeter is " + Math.round(perimeter) + ".");
    }

}
