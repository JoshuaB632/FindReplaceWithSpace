//Need Scanner for IO
import java.util.Scanner;
//Need PrintStream to change where System.out.print() goes
import java.io.PrintStream;
//Need File for intermediate steps in making Scanner and PrintStream
import java.io.File;

public class FindReplaceWithSpace{
	//Main method, ran on execution of file
	public static void main(String[] cheese){
		//var user is for user input
		Scanner user = new Scanner(System.in);

		//Ask for name of file
		System.out.print("\nName of File: ");
		//Gets input of user and stores as var fileName
		String fileName = user.nextLine().trim();

		//Additional processing if fileName doesn't end in ".txt"
		if(fileName.length() < 4 || !fileName.substring(fileName.length()-4).equals(".txt")){
			//adds ".txt" to the end of the file
			fileName += ".txt";
		}

		//need to use try cause "...new File..." can throw an uncaught error
		try{
			//var fileRead can read the file given
			Scanner fileRead = new Scanner(new File(fileName));
			//var file is empty now, but will contain the entire contents of the file
			String file = "";

			//Loop until the var fileRead has gone through the whole file
			while(fileRead.hasNextLine()){
				//Reads and adds to var file
				file += fileRead.nextLine() + "\n";
			}

			//In case anything happens, creates a file called FindReplaceWithSpaceBackup.txt
			PrintStream backup = new PrintStream(new File("FindReplaceWithSpaceBackup.txt"));
			//Fills the file FindReplaceWithSpaceBackup.txt with the text the input read
			backup.print(file);

			//Asks what to look for in the file
			System.out.print("What to replace with newline (case sensitive and whitespace sensitive): ");
			//var toReplace stores the userInput
			String toReplace = user.nextLine();
			//var index keeps track of next index of var toReplace within var file
			int index = file.indexOf(toReplace);;
			//Loop to replace all of the specified regex with newlines
			while(index != -1){
				//Replace next instance of toReplace
				file = file.substring(0, index) + "\n" + file.substring(index+toReplace.length());
				//Update var index
				index = file.indexOf(toReplace);
			}
			
			//var file is now a printStream connected to a new file called "OUTPUT_FindReplaceWithSpace.txt"
			PrintStream output = new PrintStream(new File("OUTPUT_FindReplaceWithSpace.txt"));
			output.print(file);
		}
		catch(Exception e){
			//Deals with any errors such as FileNotFound
			System.out.println("ERROR: " + e.getMessage());
			//No file to work with, so end the code
			return;
		}
	}
}