
# Homework 6
This program asks the user to enter the month and the year and output the number of days in that month by using the two classes named Month and named MonthDays that created in this program. Built with Java.

## Program explanation

## 1. Month class
Month class contains three constructor and five methods

Constructor:
- A no-arg constructor that sets the monthNumber field to 1.
- A constructor that accepts an int as an argument. It will set the monthNumber field to the number of the month
- A constructor that accepts a String as an argument. It will set the monthNumber field to the number of the month corresponding to the name of the month

Methods:
- A setMonthNumber method that accepts an int argument. The method will set monthNumber field to 1.
- A getMonthNumber method that will returns the value in the monthNumber field.
- A getMonthName method that will returns the name of the month corresponding in the monthNumber field.
- A toString method that will returns the getMonthName method.
- An equals method that accepts a Month object as an argument. It will returns true if the value in monthNumber field between two Month objects are the same. Otherwise, it will returns false.

## 2. MonthDays class
MonthDays class extends Month class and it contains one constructor and one method

Constructor:
- A constructor that accepts two int as an argument. It will set the number of the month and the year

Methods:
- A getNumberOfDays method that will returns the number of days that's corresponding to the specified month based in the month and year filed 

## Running Tests
To run for tests, input the month and the year and it will output the number of days in that month

For exmaple:

Enter a month (1-12)

2 [Enter]

Enter a year

2008 [Enter]

Output:

February 2008 has 29 days
