# FindReplaceWithSpace
A short custom program that takes in the name of a text file and a case-sensitive whitespace-sensitive string. All occurrences of the string within the text file are replaced with a single space.


README for FindReplaceWithSpace Program

Instructions for executing through CMD:
- (WARNING) You need JDK or JRE to execute the java file (WARNING)
- Grab the FindReplaceWithSpace.java file and move it to the same directory as the text file you want to use it on
- (Recommended) Make a new folder and put both FindReplaceWithSpace.java and the text file into it
- Open Command Prompt (either by Windows Key + R and typing cmd or by pressing Windows Key and searching for Command Prompt)
- Move the command prompt directory to the location with FindReplaceWithSpace.java
	1) type: "dir" to see the files and directories in your current location
	2) type: "cd directoryName" and replace "directoryName" with the name of the directory to travel to
	3) Repeat steps 1 and 2 until you get to the correct directory
- Once in the correct directory, run the following command: "javac FindReplaceWithSpace.java"
- Assuming there is no error, run the following command: "java FindReplaceWithSpace.java"


Instructions for runtime:
There will be two inputs necessary, one asking for the name of the file and another asking for the string to replace. Each should be obvious when asking. Currently the program only works on text files, so it assumes the file is a text file. It automatically adds ".txt" if it isn't there, so feel free to write the file name with or without it. When answering the string to replace, be careful because the input is case sensitive (upper case and lower case are different) and whitespace sensitive (any extra spaces before or after will count).


Instructions for after runtime:
Once the program runs correctly, it should just go back to the Command Prompt. Once you get to this point, go ahead open a file explorer and find the same location where it was ran. Once there, you should be able to find a couple extra files:
- FindReplaceWithSpace.java - original file, contains the code written in java
- FindReplaceWithSpace.class - file with byte code (code that specifically your computer can understand and run)
- FindReplaceWithSpaceBackup.txt - text file with a copy of the original file. Also tells you what the program read from the file
- OUTPUT__FindReplaceWithSpace.txt - text file with newlines replacing the previously entered character
