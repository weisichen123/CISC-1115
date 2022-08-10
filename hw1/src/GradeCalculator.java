import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Store a variable of the total score percentage
        double percentage = 100;

        // Let the user input the values of scores and percentages and store them into variables
        System.out.println("Please enter HomeWork score (0 - 100)");
        double Homework = sc.nextDouble();
        System.out.println("Please enter HomeWork percentage (Integer only)");
        double Homework_percentage = sc.nextInt();
        double HomeWork_score = Homework_percentage/percentage*Homework;

        System.out.println("Please enter CodeLab score (0 - 100)");
        double CodeLab = sc.nextDouble();
        System.out.println("Please enter CodeLab percentage" + " (your remaining percentage is " + (int)(percentage - Homework_percentage) + "%)");
        double CodeLab_percentage = sc.nextInt();
        double Code_lab_score = CodeLab_percentage/percentage*CodeLab;
       
        System.out.println("Please enter Midterm 1 score (0 - 100)");
        double Midterm_1 = sc.nextDouble();
        System.out.println("Please enter Midterm 1 percentage" + " (your remaining percentage is " + (int)(percentage - (Homework_percentage+CodeLab_percentage)) + "%)");
        double Midterm_1_percentage = sc.nextInt();
        double Midterm_1_score = Midterm_1_percentage/percentage*Midterm_1;

        System.out.println("Please enter Midterm 2 score (0 - 100)");
        double Midterm_2 = sc.nextDouble();
        System.out.println("Please enter Midterm 2 percentage" + " (your remaining percentage is " + (int)(percentage - (Homework_percentage+CodeLab_percentage+Midterm_1_percentage)) + "%)");
        double Midterm_2_percentage = sc.nextInt();
        double midtemr_2_score = Midterm_1_percentage/percentage*Midterm_2;

        System.out.println("Please enter Final exam score (0 - 100)");
        double Final = sc.nextDouble();
        System.out.println("Please enter Final exam percentage"+ " (your remaining percentage is " + (int)(percentage - (Homework_percentage+CodeLab_percentage+Midterm_1_percentage+Midterm_2_percentage)) + "%)");
        double Final_percentage = sc.nextInt();
        double Final_percentage_score = Final_percentage/percentage*Final;

        // Store the total score and output the rounded up result
        double total_score =(HomeWork_score + Code_lab_score + Midterm_1_score + midtemr_2_score+ Final_percentage_score);
        System.out.println("The total score is " + Math.round(total_score)  + ".");
    }
    
}
