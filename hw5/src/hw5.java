import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class hw5{
    // main method
    public static void main(String[] args) throws Exception {
        File fe = new File("input.txt");
        Scanner sc = new Scanner(fe);
        
        // Created vehicle, speed and time variables
        String vehicle;
        int speed;
        int time;

        // Create while loop to read the file for each variable
        while(sc.hasNext()){
            sc.nextLine();
            vehicle = sc.next();
            speed = sc.nextInt();
            time = sc.nextInt();
            
            // Call the method in the loop to print all the vehicle's data in one file
            saveAsFile("output.txt", speed, time, vehicle);
        }
    }

    // distance method
    public static int[] distance (int speed, int time) {
        // create an array to store all the distances by hours
        int[] d = new int[time];
        // create a for loop to get the distance of each hour and return in an array
        for(int i = 1; i <= time; i++){
            d[i-1] = speed*i;
           }
           return d;
        }
     
    // saveasfile method
    public static void saveAsFile(String x, int speed, int time, String vehicle) throws Exception {
        // create a printstream inside the method with string as args to name and create the output file.
        PrintStream ps = new PrintStream(new FileOutputStream(x, true));
        // call the distance method inside the method
        int[] d = distance(speed, time);
        // create a for loop to get the distance by hour from the array in distance method
            for(int i = 1; i <= d.length; i++){
                // use if statement to make the format look better and print to the output file and terminal
                if(i==1){
                    ps.printf( "Veichle Hour Distance Traveled%n%s %3d %10d%n", vehicle , i, d[i-1]);
                    System.out.printf("Veichle Hour Distance Traveled%n%s %3d %10d%n", vehicle , i, d[i-1]);
                }
                else{
                    ps.printf("%s%4d %10d%n", vehicle ,i, d[i-1]);
                    System.out.printf("%s%4d %10d%n", vehicle ,i, d[i-1]);
                }
            }
            // start in a new line after each vehicle to make the format look better
            ps.println();
            System.out.println();
   }
}


