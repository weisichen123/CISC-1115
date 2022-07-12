// import array package to access arrays and time type package
import java.util.Arrays;
import java.time.LocalTime;


public class hw4{
    public static void main(String[] args) {
        // call method 1
        basicArray();
        System.out.println();
       

        // call method 2
        String[] strarr = {"first", "second", "thrid", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};
        printElements(strarr);
        System.out.println("\n");
        
    
        // call method 4
        LocalTime[] t = new LocalTime[3];
        t[0] = LocalTime.of(22,59,58);
        t[1] = LocalTime.of(21,30,25);
        t[2] = LocalTime.of(7,35,36);
        printElements(t);
        System.out.println("\n");

        // call method 3
        int[][] values = new int[10][20];
        // create a for loop to take the size of the row
        for(int row = 0; row < values.length; row++){   
            // create another for loop to take the value to fill the colunm
            for(int col = 0; col <values[row].length; col++){   
                values[row][col] = col;
            }
        }
        printElements(values);
}

    // Method 1
    public static void basicArray(){
        // create a array within 50 elements
        int[] nums = new int[50];
        // start from 1, let the index 0 equals to value 1 and add 10
        nums[0]=1+10;
        // create a for loop to store the values from 2 to 50 and add 10 to each
        for(int a=1; a<nums.length; a++){
            nums[a]=a+1+10;
        }
        // use the java package to output the ints array
        System.out.println(Arrays.toString(nums));
    }

    // Method 2
    public static void printElements(String[] x){
        // use the java package to output the string array
        System.out.print(Arrays.toString(x));
    }

    // Method 3
    public static void printElements(int[][] x) {
        // create a for loop to take the index for row
        for (int row = 0; row < x.length; row++) {
            // create a antoher for loop to take the elements in the index for column
            for (int col = 0; col < x[row].length; col++) {
                // output fromat with a spaces
                System.out.printf("%s ", x[row][col] );
            }
            // output next row start on a new line
            System.out.println();
        }
    }

    // Method 4
    public static void printElements(LocalTime[] x){
        // use the java package to output the time type array
        System.out.print(Arrays.toString(x));
    } 
}
