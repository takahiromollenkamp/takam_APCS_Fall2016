package fracCalc;
import java.util.*;
//Takahiro Mollenakamp 11/9/16

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
    			splitted=splitted.substring(splitted.indexOf("_"));
    		} else {
    			part[0]="0";
    		}

    		if (splitted.indexOf("/")!=-1){
    			part[1]=splitted.substring(1,splitted.indexOf("/"));
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
