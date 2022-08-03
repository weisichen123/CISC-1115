
# Homework 7
This program simulate a real car driving by using the three classes named Car, FuelGauge and Odometer that simulate a car to filling up with fuel as gallon and odometer as the miles that traveled by the car. While the car is drving, it will display the car’s current mileage, amount of fuel left and the current speed after each of accelerating and braking til run out of fuel. Built with Java.
## Program explanation

## 1. Car Class
Car Class contains two constructor and eight methods

Constructor:

- A no-arg constructor.
- A constructor that accepts an int and a string as argument. It will set the car’s year model and make while also set the speed filed to 0.

Methods:

- A setYearModel method that accepts an int argument. The method will set car's yearmodel.
- A getYearModel method that will returns the value in the yearModel field.
- A setMake method that accepts a string argument. The method will set car's make.
- A getMake method that will returns the value in the Make field.
- A setSpeed method that accepts an int argument. The method will set car's speed.
- A getSpeed method that will returns the value in the speed field.
- A accelerate method that will add 5 to the speed field.
- A brake method that will decrease 5 to the speed field.

## 2. FuelGauge Class
FuelGauge Class contains two constructor and four methods

Constructor:
- A no-arg constructor.
- A constructor that accepts an int as argument. It will set the car’s fuel, the max is 15.

Methods:
- A setGallons method that accepts an int argument. The method will set the amount gallons of the car.
- A getGallons method that will returns the value in the gallons field.
- A incrementGallons method that will increase the gallons file by 1, the max is 15.
- A decrementGallons method that will decrease the gallons file by 1 plus a random fraction generated.

## 3. Odometer Class
Odometer Class contains two constructor and six methods

Constructor:
- A no-arg constructor.
- A constructor that accepts an int as argument. It will set the mileage file.

Methods:
- A setFuelGauge method that accepts fuelgauge object argument. It will set the fuelgauge object.
- A getFuelGauge method that will returns the object in the fuelgauge.
- A setMileage method that accepts an int as argument. It will set the mileage file.
- A getMileage method that will returns the value in the mileage file.
- A incrementMileage method that will increase the mileage file by 1 and the max is 999999.
- A decrementMileage method that will decrease 1 gallon by every 24 mileage.

## Running Tests
To run for tests, fill the fuel with in max of 15 gallons in FuelGauge object and set the start mileage as 0 in Odometer object.

## For exmaple (fill with 1 gallon and set the start mileage at 0):

FuelGauge fuel = new FuelGauge(1); 

Odometer odometer = new Odometer(0); 

## Output (below only showing after 1 miles of drving, the program will disaply all the mileage til out of fuel):

Current Mileage: 1

Current Fuel left: 1 gallons

Accelerating...

Current speed after first accelerate: 5 miles  

Current speed after second accelerate: 10 miles

Current speed after third accelerate: 15 miles

Current speed after fourth accelerate: 20 miles

Current speed after fifth accelerate: 25 miles

Braking...


Current speed after first brake: 20 miles

Current speed after second brake: 15 miles

Current speed after third brake: 10 miles

Current speed after fourth brake: 5 miles

Current speed after fifth brake: 0 miles
