public class hw7 {
    public static void main(String[] args) {

        // created a car object
        Car car1 = new Car();

        // created a fuel object with numbers of gallons fill in
        FuelGauge fuel = new FuelGauge(15);

        // created a odometer object starting at 0 mileage
        Odometer odometer = new Odometer(0);

        //set object fuel to the odometer 
        odometer.setFuelGauge(fuel);

        // drive until no more fuel.
        while(fuel.getGallons() > 0){

            //drive 24 mileage while decrease 1 gallons
            odometer.incrementMileage();
            odometer.decrementMileage();

            // Display the mileage.
            System.out.println("Current Mileage: " + odometer.getMileage());

            // Display the amount of fuel.
            System.out.println("Current Fuel left: " + fuel.getGallons() + " gallons");

            //accelerating multiples of 5
            System.out.println("Accelerating...");
            car1.accelerate();
            System.out.println("Current speed after first accelerate: " + car1.getSpeed() + " miles");
            car1.accelerate();
            System.out.println("Current speed after second accelerate: " + car1.getSpeed() + " miles");
            car1.accelerate();
            System.out.println("Current speed after third accelerate: " + car1.getSpeed() + " miles");
            car1.accelerate();
            System.out.println("Current speed after fourth accelerate: " + car1.getSpeed() + " miles");
            car1.accelerate();
            System.out.println("Current speed after fifth accelerate: " + car1.getSpeed() + " miles");

            // Display the current speed of the car after each brake
            System.out.println("Braking...");
            car1.brake();
            System.out.println("Current speed after first brake: " + car1.getSpeed() + " miles");
            car1.brake();
            System.out.println("Current speed after second brake: " + car1.getSpeed() + " miles");
            car1.brake();
            System.out.println("Current speed after third brake: " + car1.getSpeed() + " miles");
            car1.brake();
            System.out.println("Current speed after fourth brake: " + car1.getSpeed() + " miles");
            car1.brake();
            System.out.println("Current speed after fifth brake: " + car1.getSpeed() + " miles");

            // spread by a line of each mileage
            System.out.println();
        }
    }

    
// Car class
static class Car{
    private int yearModel;
    private String make;
    private int speed;

    // constructor
    public Car(){

    }

    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }

    //get and set methods
    public int getYearModel() {
        return this.yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    // accelerate by 5 method
    public void accelerate(){
        speed += 5;
    }

    // brake by 5 method
    public void brake(){
        speed -=5;
    }
}
    
// FuelGauge class
static class FuelGauge{
    private int gallons;
    final int MAX_GALLONS = 15;

    // constructor
    public FuelGauge(){

    }

    // fill the fuel with int input
    public FuelGauge(int gallons){
        if(gallons <= MAX_GALLONS){
            this.gallons = gallons;
        }else{
            System.out.println("FUEL OVERFLOWING!");
        }
    }

    // get and set methods
    public int getGallons() {
        return this.gallons;
    }

    public void setGallons(int gallons) {
        this.gallons = gallons;
    }

    // increment the amount of fuel by 1 gallon, 15 is max
    public void incrementGallons(){
        if(gallons < MAX_GALLONS){
            gallons ++;
        }
    }

    // decrement the amount of fuel by 1 gallon plus a random fraction generated
    public void decrementGallons(){
        if(gallons > 0){
            gallons -= 1 - Math.random();
        }
    }
}
    
// Odometer class
static class Odometer{
    final int MAX_MILEAGE = 999999;
    private int mileage;
    private int MPG = 24;
    private FuelGauge fuelGauge;

    // constructor
    public Odometer(){

    }

    public Odometer(int mileage){
        this.mileage = mileage;
    }

    // get and set methods
    public FuelGauge getFuelGauge() {
        return this.fuelGauge;
    }

    // set fuelgauge object as input 
    public void setFuelGauge(FuelGauge fuelGauge) {
        this.fuelGauge = fuelGauge;
    }
    
    public int getMileage() {
        return this.mileage;
    }
    
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    // increment method, add miles after each mileage was drive
    public void incrementMileage(){
        if(mileage < MAX_MILEAGE){
            mileage ++;
        }else{
            mileage = 0;
        }
    }

    // decrement method, 24 miles for 1 gallon decrease
    public void decrementMileage(){
        if(mileage % MPG == 0){
            fuelGauge.decrementGallons();
        }
       }
    }
}


