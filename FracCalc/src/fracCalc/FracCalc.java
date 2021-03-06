//Takahiro Mollenakamp 12/5/16
//FracCalc program
//This program performs fraction calculations and returns reduced and simplified answer
//I did extra credit. Multiple operations and input error check. It's the for loop and errorrCheck method

package fracCalc;
import java.util.*;

public class FracCalc {
	private static Scanner input;
	public static void main(String[] args) 
	{	
		System.out.println("enter an operation");
		input = new Scanner(System.in);
		String userInput=input.nextLine();
		while(userInput.equals("quit")==false){//loopty loop til "quit"
			String answer=produceAnswer(userInput);
			System.out.println(answer);
			System.out.println("enter another one, or type quit");
			userInput=input.nextLine();
		}
		System.out.println("THE END");
	}
	public static String produceAnswer(String input){
		String answer="";
		String[] split = input.split(" ");//split to first operand, operator, and second operand
		if(split.length<3){
			answer="ERROR: enter in order of first operand, space, operator, space, second operator.";
		} else{

			int[] firstOp=components(split[0]);//split to whole, numerator, denominator
			int[] secondOp=components(split[2]);
			convertToImproper(firstOp);
			convertToImproper(secondOp);
			String errorMessage=errorCheck(split[1], firstOp, secondOp);//error handling
			if(errorMessage.equals("pass")){
				int[] finalArray=compute(firstOp,secondOp,split[1]);
				answer=finalAnswer(finalArray,firstOp);

				for(int i=3; i<split.length; i+=2){//multiple operations
					int[] newArray=components(split[i+1]);//get next operand
					convertToImproper(firstOp);
					convertToImproper(newArray);
					finalArray=compute(firstOp,newArray,split[i]);
					answer=finalAnswer(finalArray,firstOp);
				}
			} else answer=errorMessage;
		}
		return answer;
	}
	public static int[] compute(int[] first, int[] second, String operator){
		boolean add=operator.equals("+");
		boolean subtract=operator.equals("-");
		boolean multiply=operator.equals("*");
		boolean divide=operator.equals("/");
		int numerator=0;
		int denominator=1;
		if(add||subtract){//add and subtract are similar
			denominator = first[2]*second[2];
			first[1]*=second[2];
			second[1]*=first[2];
			if(subtract){//numerator changes sign in subtraction
				second[1]*=-1;
			}
			numerator=first[1]+second[1];
		}
		if(multiply||divide){//multiply and divide are similar
			if(divide){//flippity dippity
				int a=second[1];
				int b=second[2];
				second[2]=a;
				second[1]=b;
				if(a<0){//don't want negative denominator
					second[2]*=-1;
					second[1]*=-1;
				}
			}
			numerator=first[1]*second[1];// multiply fractions
			denominator=first[2]*second[2];	
		}
		int[] solution={numerator,denominator};
		return solution;
	}
	public static String finalAnswer(int[] almostDone, int[] freshArray){
		//this method gives the final answer
		String answer="";
		int common=Math.abs(gcf(almostDone[0],almostDone[1]));//find common denominator to simplify
		int numerator=almostDone[0]/common;//simplify numerator
		int denominator=almostDone[1]/common;//simplify denominator
		int whole = numerator/denominator;
		int remainder = numerator%denominator;
		freshArray[0]=whole;
		if(whole==0){//this section is used when there are more than one operation
			freshArray[1]=remainder;
		} else{
			freshArray[1]=Math.abs(remainder);
		}
		freshArray[2]=denominator;
		if(whole!=0&&remainder<0){ 
			remainder*=-1;
		}
		if (denominator<0){
			denominator*=-1;
		}
		if(remainder==0){
			answer+=whole;
		}
		else if(whole==0){
			answer=numerator+"/"+denominator;
		} else{
			answer=whole+"_"+remainder+"/"+denominator;
		}
		return answer;
	}

	public static int[] components(String splitted){//split to components
		String[] part= {"0","0","1"};
		if(splitted.indexOf("_")==-1&&splitted.indexOf("/")==-1){
			part[0]=splitted;
		} else{
			if (splitted.indexOf("_")!=-1){//whole number part
				part[0]=splitted.substring(0, splitted.indexOf("_"));
				splitted=splitted.substring(splitted.indexOf("_")+1);
			} 
			if (splitted.indexOf("/")!=-1){//separate numerator and denominator
				part[1]=splitted.substring(0,splitted.indexOf("/"));
				part[2]=splitted.substring(splitted.indexOf("/")+1);
			} 
		}
		int[] comp={Integer.parseInt(part[0]),Integer.parseInt(part[1]),Integer.parseInt(part[2])};
		//convert from string to int data type
		return comp;
	}
	public static void convertToImproper(int array[]){//change to improper fraction
		if (array[0]<0){//negative number check
			array[1]=array[0]*array[2]-array[1];
		} else{
			array[1]+=(array[0]*array[2]);
		}
		array[0]=0;
	}
	public static int gcf(int a, int b){//determines greatest common factor
		while(a!=0 && b!=0)
		{int c = b;
		b = a%b;
		a = c;
		}
		return a+b;
	}
	public static String errorCheck(String operand, int[] first, int[] second){//error checking program
		String errorOutput="";
		if (operand.equals("+")||operand.equals("-")||operand.equals("/")||operand.equals("*")){
			errorOutput="pass";	//operand check
		} else{
			errorOutput="Error: Input is in an invalid format. ";
		}
		if(first[2]==0||second[2]==0){
			errorOutput="Error: Cannot divide by zero";//is the denominator zero?
		}
		if(operand.equals("/")&&second[1]==0){
			errorOutput="ERROR: Cannot divide by zero";//in an operation
		}
		return errorOutput;
	}
}
