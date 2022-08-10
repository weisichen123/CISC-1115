// BufferedReader to read the line in the file 
import java.io.BufferedReader;
// FileReader to open a file to read
import java.io.FileReader;
// File to find the file location
import java.io.File;

public class wordcount {
    public static void main(String[] args) throws Exception{

        // line variable as the texts in the file
        String line; 
        // wordcount variable to count the characters
        int wordcount = 0;
        // wordscount variable to count the vocabulary
        int wordscount = 0;

        // create a FileReader object by input the file name in the command line
        FileReader fr = new FileReader(new File(args [0]));
        // create a BufferedReader object to read the file
        BufferedReader br = new BufferedReader(fr);  

        // read every line in the file till reach the end
        while((line = br.readLine()) != null) {  
            // split each characters 
            String word[] = line.split("");  

            // count the number of each characters and store them into the wordcount variable
            wordcount = wordcount + word.length; 
            
            // split each vocabulary by a space 
            String words[] = line.split(" "); 
 
            // count the number of each vocabulary and store them into the wordscount variable
            wordscount = wordscount + words.length; 
    }
    // output the result for both characters and vocabulary counts
    
    
    System.out.println("Number of word by every characters (including symbol and space) : " + wordcount);  
    

    System.out.println("Number of words by every vocabulary: " + wordscount);  
    
    }
}