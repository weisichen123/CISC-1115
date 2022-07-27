// extends the month class 
public class MonthDays extends Month {
    // int field for month, year and day
    int m, y, d;

    // The class’s constructor accept two int for month and yaer
    public MonthDays(int month, int year){
        // assign month and year values to member variables m and y
        m = month;
        y = year;
    }

    // get number of days method
    public int getNumberOfDays() throws Exception {
        // check if year is a correct value
        if (y > -1){
            // if year can divisible by 100 or 400 or 4, it is a leap yaer, then assign 366 to the d as days
            if (y % 100 == 0 || y % 400 == 0 || y % 4 == 0) {
            d = 366;
            // else it is not a leap yaer, then assign 365 to the d as days
            }else{
            d = 365;
            }
        } else {
            // throw a exception if year is negative
            throw new Exception("Year input can't be " + y);
        }

        // return the number of days in the specified month
        if(m == 1) {
            return 31;
        }else if((m == 2) && (d == 365)) {
            // February 28 days when it is not a leap year
            return 28;
        }else if((m == 2) && (d == 366)) {
            // February 29 days when it is a leap yaer
            return 29;
        }else if(m == 3) {
            return 31;
        }else if(m == 4) {
            return 30;
        }else if(m == 5) {
            return 31;
        }else if(m == 6) {
            return 30;
        }else if(m == 7) {
            return 31;
        }else if(m == 8) {
            return 31;
        }else if(m == 9) {
            return 30;
        }else if(m == 10) {
            return 31;
        }else if(m == 11) {
            return 30;
        }else if(m == 12) {
            return 31;
        }else
            // throw a exception if month is invaild
            throw new Exception("Month input can't be " + m);
    }
}

