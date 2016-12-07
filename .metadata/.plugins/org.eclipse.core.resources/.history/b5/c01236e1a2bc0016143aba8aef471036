package fracCalc;

import java.util.Scanner;

/*
  public static String produceAnswer(String input)
    {   String answer="";
    	String[] split = input.split(" ");//split to first operand, operator, and second operand
        int[] firstOp=components(split[0]);
        int[] secondOp=components(split[2]);
        convertToImproper(firstOp);
        convertToImproper(secondOp);
        int[] finalArray=new int[2];
        if (split[1].equals("+")){
        	finalArray =add(firstOp, secondOp);
        }
        if (split[1].equals("-")){
        	finalArray =subtract(firstOp, secondOp);
        }
        if (split[1].equals("*")){
        	finalArray =multiply(firstOp, secondOp);
        }
        if (split[1].equals("/")){
        	finalArray=divide(firstOp, secondOp);
        }
        answer=finalAnswer(finalArray);
        return answer;
    }
    public static int[] add(int[] first, int[] second){
    	int denominator = first[2]*second[2];
    	first[1]*=second[2];
    	second[1]*=first[2];
    	int numerator=first[1]+second[1];
    	int[] solution={numerator,denominator};
    	return solution;
    	//figure negative numbers
    }
    public static int[] subtract(int[] first, int[] second){
    	int denominator = first[2]*second[2];
    	first[1]*=second[2];
    	second[1]*=first[2];
    	int numerator=first[1]-second[1];
    	int[] solution={numerator,denominator};
    	return solution;
    }
    public static int[] multiply(int[] first, int[] second){
    	int numerator=first[1]*second[1];
    	int denominator=first[2]*second[2];
    	int[] solution={numerator,denominator};
    	return solution;
    }
    public static int[] divide(int[] first, int[] second){
    	int a=second[1];
    	int b=second[2];
    	if(a<0){
    		a=-a;
    		b=-b;
    	}
    	int numerator=first[1]*b;
    	int denominator=first[2]*a;
    	int[] solution={numerator,denominator};
    	return solution;
    }
 */
public static int[] compute(int[] first, int[] second, String operator){
	boolean add=operator.equals("+");
	boolean subtract=operator.equals("-");
	boolean multiply=operator.equals("*");
	boolean divide=operator.equals("/");
	int numerator=0;
	int denominator=1;
	if(add||subtract){
		denominator = first[2]*second[2];
    	first[1]*=second[2];
    	second[1]*=first[2];
    	if(subtract){
    		second[1]*=-1;
    	}
    	numerator=first[1]+second[1];
	}
	if(multiply||divide){
		if(divide){
			int a=second[1];
			int b=second[2];
			second[2]=a;
			second[1]=b;
			if(a<0){
				second[2]*=-1;
				second[1]*=-1;
			}
		}
		 numerator=first[1]*second[1];
    	 denominator=first[2]*second[2];	
	}
	int[] solution={numerator,denominator};
	return solution;
}

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
	    

}
/*
 
 part 2 code
 public class FracCalc {
 
 

public static void main(String[] args) 
{	
	System.out.println("enter your operation");
	Scanner input=new Scanner(System.in);//scanner
	String userInput=input.nextLine();
	while(userInput.equals("quit")==false){
		String answer=produceAnswer(userInput);
		System.out.println(answer);
		System.out.println("hit me again");
		userInput=input.nextLine();
	}
	System.out.println("THE END");
}
public static String produceAnswer(String input)
{ 
    String[] split = input.split(" ");
    int[] op1=components(split[0]);
    int[] op2=components(split[2]);
    String answer="whole:"+op2[0]+" numerator:"+op2[1]+" denominator:"+op2[2];
    return answer;
}

public static int[] components(String splitted){
	String[] part= new String[3];
	if(splitted.indexOf("_")==-1&&splitted.indexOf("/")==-1){
		part[0]=splitted;
		part[1]="0";
		part[2]="1";

	} else{


		if (splitted.indexOf("_")!=-1){
			part[0]=splitted.substring(0, splitted.indexOf("_"));
			splitted=splitted.substring(splitted.indexOf("_")+1);
		} else {
			part[0]="0";
		}

		if (splitted.indexOf("/")!=-1){
			part[1]=splitted.substring(0,splitted.indexOf("/"));
			part[2]=splitted.substring(splitted.indexOf("/")+1);
		} else{
			part[1]="1";
			part[2]="0";
		}
	}
	int[] comp=new int [3];
	for(int i=0; i<3; i++){
		comp [i]= Integer.parseInt(part[i]);
	}
	return comp;	
}
}
*/