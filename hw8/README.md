# Homework 8

Source file contatins two programs, they are word count program and calculator program. Word count program written to count number of words that a file contains and calculator program written to evaluate simple expressions. Built with Java.

## Program explanation
To run tests, read the following

* Word count program will take the name of text file from the command line arguments and display the numbers of characters (including symbol and space) and vocabulary of that file contains.

* Calculator program will be typed in by the user. The input always consists of a number, followed by an operator, followed by another number. The operators that are allowed are +, -, *, and /. When the user enters 0 as the first number on the line, the program will be end.

## For example (wordcount): 
File name: "input.txt"

how are you doing?

how are you doing?

### Run test:

Pass the name of text file from the command line:

javac wordcount.java

java wordcount input.txt

### Output:
Number of word by every characters (including symbol and space) : 36

Number of words by every vocabulary: 8

## For example (calculator): 

### Run test :
Please enter first number (Enter 0 to end the program)

13 [Enter]

Please choose an operator: +, -, *, or /

+[Enter]

Please enter second number

7 [Enter]

### Output:
13.0 + 7.0 = 20.0

### Run test continues:
Please enter first number (Enter 0 to end the program)

4.2 [Enter] 

Please choose an operator: +, -, *, or /

*[Enter]

Please enter second number

1.7 [Enter]

### Output:
4.2 * 1.7 = 7.14

### Run test continues:
Please enter first number (Enter 0 to end the program)

0 [Enter]

### Output:
Thank you
