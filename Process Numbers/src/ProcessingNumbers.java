//collaborative programming activity
//Takahiro Mollenkamp 9/29/16

import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.print("How many integers are you going to enter? ");
		int numOfLoop=userInput.nextInt();
		if(numOfLoop<1){throw new IllegalArgumentException("Start over. Positive integer only");}
		System.out.print("Enter all of your integers: ");
		int max=userInput.nextInt();
		int min=max;
		int totalEven=0;
		int maxEven=-999999998;//use this later to make sure the user entered at least one even int
		if (max%2==0){
			totalEven=max;
			maxEven=max;
		}
		for (int i=1;i<numOfLoop;i++){//I already have the first number so I need one less loop
            int num=userInput.nextInt();
            if(num>max){
            	max=num;
            }
            if (num<min){
            	min=num;
            }
            if (num%2==0){
            	totalEven+=num;
            	if (num>maxEven){
            		maxEven=num;
            	}
            }
		}
            System.out.println("maximum is "+max+" and minimum is "+min);
            if (maxEven==-999999998){
            	System.out.println("You didn't enter any even numbers"); 	
            }
            else {
            	System.out.println("Total of even numbers is "+totalEven+" maximum of even is "+maxEven);
            
		}
	}

}
