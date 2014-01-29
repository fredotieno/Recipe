import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Recipe {
	String filename = "Recipe.txt";
	String line = null;
	public void readRecipe(){
    try{
        // FileReader reads text files in the default encoding.
        FileReader fileReader = new FileReader(filename);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
        	int i = 1;
        	if(line.charAt(0)== '+'){
        		System.out.println("Press N to move to the next step");
        		Scanner scan = new Scanner(System.in);
        		String command = scan.nextLine();
        		if(command.charAt(0)=='N'){
        			System.out.println(line);
        		}
        	}
        	else {
            System.out.println(line);
        	}
        }	

        // Always close files.
        bufferedReader.close();			
    }
    catch(FileNotFoundException ex) {
        System.out.println(
            "You dont have messages in your inbox");				
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading inbox");					
        // Or we could just do this: 
        // ex.printStackTrace();
    }
	}
}
