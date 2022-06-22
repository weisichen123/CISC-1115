import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class accounting {
    public static void main(String[] args) throws Exception {
        // Created a scanner to scan the data that want to verify and Created a new file to write in the verfied data.
        Scanner sc = new Scanner(new File("report.txt"));
        PrintStream ps = new PrintStream("verify.txt");

        // Scanned those token that don't need to use in this program
        String d,s,p,D;
        d = sc.next();
        s = sc.next();
        p = sc.next();
        D = sc.next();

        // Declared the variables for the start date and the end date
        String date2 = "";
        String start = "";
        int number = 1;

        // Stored the 
        int total = 0;

        // Declared the max and min value to find the lowest and highest price
        Double highestPrice = Double.MIN_VALUE;
        Double lowestPrice = Double.MAX_VALUE;

        // variables for the highest price sku and the lowest price sku
        int sku = 0;
        int lowSku = 0;

        // Created a while loop to scan all the data
        while (sc.hasNext()) {

            // read the first line in the file
            if (number == 1){
                start = sc.next();
                int sku1 = sc.nextInt();
                Double price = sc.nextDouble();
                Double discount = sc.nextDouble();

                // compared to the min value to find the highest price after discount and the highest sku
                if(highestPrice < price-(price*discount/100)){
                    highestPrice = Math.max(highestPrice,price-(price*discount/100));
                    sku = sku1;
                } 
                
                // compared to the highest price to find the lowest price after discount and the lowest sku
                if( lowestPrice> price-(price*discount/100)){
                    lowestPrice =  Math.min(highestPrice,price-(price*discount/100));
                    lowSku = sku1;
                }
            // total price after discount
            total += Math.round(price-(price*discount/100));
                number++;
            }

            // New lines after the start line was scanned, everything else is the same as above
            else{
                date2= sc.next();
                int sku1 = sc.nextInt();
                Double price = sc.nextDouble();
                Double discount = sc.nextDouble();
                if(highestPrice < price-(price*discount/100)){
                    highestPrice = Math.max(highestPrice,price-(price*discount/100));
                    sku = sku1;
                }
            
                
                if(lowestPrice > price-(price*discount/100)){
                    lowestPrice = Math.min(highestPrice,price-(price*discount/100));
                    lowSku = sku1;
                }
               total += Math.round(price-(price*discount/100));
            }
    
        
        } // end the loop

        // print out the result on the new txt file
        ps.println("Report from " + start + " to " + date2); 
        ps.println("The total is "+ total);
        ps.println("The tax is : $"+ String.format("%.2f",total*(8.875/100.00)));
        ps.println("The Highest price item is #" + sku + " at $"+Math.round(highestPrice));
        ps.println("The Lowest price item is #" + lowSku + " at $"+Math.round(lowestPrice));
        ps.println("Completed reading report : 'report.txt' ");
        ps.println("The generated file name is: 'verify.txt' ");

        // print out the result on the terminal
        System.out.println("Report from " + start + " to " + date2); 
        System.out.println("The total is $"+ total);
        System.out.println("The tax is : $"+ String.format("%.2f",total*(8.875/100.00)));
        System.out.println("The Highest price item is #" + sku + " at $"+Math.round(highestPrice));
        System.out.println("The Lowest price item is #" + lowSku + " at $"+Math.round(lowestPrice));
        System.out.println("Completed reading report : 'report.txt' ");
        System.out.println("The generated file name is: 'verify.txt' ");
    }
}

