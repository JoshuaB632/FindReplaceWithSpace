# FindReplaceWithSpace

## Table of Contents

- [Program Use README](#program-use-readme)
- [Project Overview](#project-overview)
- [Sample Run](#sample-run)

### Program Use README

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

### Project Overview

A short custom program that takes in the name of a text file and a case-sensitive whitespace-sensitive string. All occurrences of the string within the text file are replaced with a newline.

### Sample Run

If the file name cannot be found:
<img width="922" height="88" alt="image" src="https://github.com/user-attachments/assets/4aeecc6f-2a7b-44f8-8fce-3b5e23bd4b95" />



Using the given SampleFile.txt:
<img width="2347" height="887" alt="image" src="https://github.com/user-attachments/assets/8fba1836-9c4f-412a-b762-f768d9ec01d5" />

Entering the file name and entering " at" (without the quotes):
<img width="903" height="88" alt="image" src="https://github.com/user-attachments/assets/6bc79b1c-7926-40dc-8838-7bf159ec0a1d" />

Creates a file named OUTPUT_FindReplaceWithSpace.txt:
<img width="1423" height="1301" alt="image" src="https://github.com/user-attachments/assets/5e133bb5-80c5-4657-9a53-3e8e5e7f8249" />
