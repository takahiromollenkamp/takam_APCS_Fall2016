package fracCalc;
import java.util.*;
//Takahiro Mollenakamp 11/4/16
//Currently, this program scans a line of input and print out the second operand
public class FracCalc {

    public static void main(String[] args) 
    {	
    	Scanner input=new Scanner(System.in);//scanner
    	String original =input.nextLine();
    	String answer = produceAnswer(original);//the method with user entered input
    	System.out.println(answer);
    }
    public static String produceAnswer(String input)
    { 
        String[] split = input.split(" ");
        return split[2];//the last element is the operand
    }
    public static String[] components(String splitted){
    	if (splitted.indexOf("_")!=-1){
    		String whole=splitted.substring(0, splitted.indexOf("_"));
    	}
    }
}
