package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

// Update this file with your own code.

public class TextExcel
{
	

	public static void main(String[] args)
	{
		// Add your command loop here
		Spreadsheet go=new Spreadsheet();
		Scanner userInput=new Scanner(System.in);
		String input=userInput.nextLine();
		while(input.equals("quit")==false){
			//do stuff
			String haha=go.processCommand(input);
			System.out.println(haha);
			input=userInput.nextLine();
		}
		
		
	}
}
