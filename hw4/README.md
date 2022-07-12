
# Homework 4

This program contains 4 methods, they are method basicArray and another 3 methods printElements with different input parameter argument. Built with Java.

## Program explanation
To run tests, read the following

## Method 1 basicArray : No input parameter

Method 1 basicArray does not take any inputs and print every element from values 1 through 50 as array while adding 10 to each entry.

For example: 

basicArray();

Output:
[11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]

## Method 2 basicArray : An array of Strings as input parameter

Method 2 printElements accepts an array of Strings as the input parameter and will print elements of the array.

For example: 

String[] strarr = {"first", "second"};

printElements(strarr);

Output:

[first, second]

## Method 3 printElements : An two-dimensional array of ints as input parameter

Method 3 printElements accepts an two-dimensional array of ints as input parameter and will print elements of the 2D array in matrix form, with number of rows refers to the array size and number of columns refers to the array values.

For example:  

int[][] values = {{10,20},{10,21}};

printElements(values);

Output:

10 20

10 21

## Method 4 printElements : An array of Time Objects as the parameter argument

Method 4 printElements accepts an array of Time Objects as the parameter and will print Time type elements of the array.

For example: 

LocalTime[] t = {LocalTime.of(22,59,58), LocalTime.of(22,59,58)};

printElements(t);

Output:

[22:59:58, 22:59:58]