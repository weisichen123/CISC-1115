import java.io.File;
import java.io.PrintStream;
// LocalDate is use to get the current date
import java.time.LocalDate;
// Period is use to calculate the difference between dates
import java.time.Period;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) throws Exception{
        File fe = new File("input.txt");
        Scanner sc = new Scanner(fe);
        PrintStream ps = new PrintStream("output.txt");

        // Created a while loop to scan the month, day and year and store them into variables
        int month, day, year, age;
        while(sc.hasNext()){
        month = sc.nextInt();
        day = sc.nextInt();
        year = sc.nextInt();

        // get the birthdate from the variables
        LocalDate birthDate = LocalDate.of(year, month, day);
        // get the currecnt date
        LocalDate today = LocalDate.now();
        // calculate the difference between years using period
        age = Period.between(birthDate, today).getYears();
        
        ps.println("The age is " + age + " years old for " + birthDate);
        System.out.println("The age is " + age + " years old for " + birthDate);
        }
    }
}