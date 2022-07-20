
# Homework 5
This program calculates distance traveled based on vehicle type and its speed and time. It contains 2 methods, they are distance method with no input parameter and saveAsFile method with different input parameter argument. Built with Java.

# Program explanation
To run tests, read the following

# 1. Intput file
Put the necessary datas in input file.

For example:


Vehicle     Speed   Hour

Ferrai      120     5

Trunck      50      8

Toyota      123     6

Subway      123     2


# 2. Call the methods

## distance method
distance method accept no input parameters, and return in an array that store the distances of each hour for a vehicle.

## saveAsFile method
saveAsFile method accepts string as the parameter to name and create the output file, while time, speed as int number and vehicle modle as string. It would print to the output file and terminal of each vehicle's distance and separate by each hours.

## Calling the methods 
To run both distance and aveAsFile method by only calling the saveAsFile method, since distance method was already called in saveAsFile method. 

For example: 

saveAsFile("output.txt", 120, 5, Ferrai);

Output file: output.txt

Veichle Hour Distance Traveled

Ferrai   1        120

Ferrai   2        240

Ferrai   3        360

Ferrai   4        480

Ferrai   5        600

Output:

Veichle Hour Distance Traveled

Ferrai   1        120

Ferrai   2        240

Ferrai   3        360

Ferrai   4        480

Ferrai   5        600
