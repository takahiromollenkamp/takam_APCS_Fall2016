package fracCalc;

import java.util.Scanner;

public class OldCode {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//scanner
    	String userInput=input.nextLine();
    	String answer=produceAnswer(userInput);
		System.out.println(answer);

	}
	 public static String produceAnswer(String input){
		 String[] split = input.split(" ");
		 return split[2];
	 }
	    

}
