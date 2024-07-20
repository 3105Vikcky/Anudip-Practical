//Write a Java program that reads an input file from the file system 
//and outputs the content of the file character by character. 
//Use FileReader.read() method to read characters from the file. 
//At the end, print the total number of characters present in the file. 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReader1
{
    public static void main(String[] args) 
    {
        // Read characters from file using FileReader 
      try (FileReader fileReader = new FileReader("C:\\Users\\user\\Desktop\\Java file operation\\Vikas.txt")) 
      {
            int character;
            int Count = 0;

            // Read characters until end of file
            while ((character = fileReader.read()) != -1) 
            {
                System.out.print((char) character); // Output character
                Count++; // Increment total character count
            }

            System.out.println("\nTotal number of characters is: " + Count);
      }
      catch(FileNotFoundException fe) 
      {
    	fe.printStackTrace();  
      }
      catch (IOException e) 
      {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
      }
    }
}

