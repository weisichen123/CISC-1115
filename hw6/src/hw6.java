import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a month (1-12)");
        int month = sc.nextInt();


        System.out.println("Enter a year");
        int year = sc.nextInt();

        // create new object for Monthdays
        MonthDays md = new MonthDays(month, year);
        // call setMonthNumber method, it extended from the Month class and set the monthNumber as the input value
        md.setMonthNumber(month);
        // output by call the getMonthName method to get the monthname and getNumberOfDays method to ge the number of days
        System.out.println(md.getMonthName() + year + " has " + md.getNumberOfDays() + " days ");
    }
}
