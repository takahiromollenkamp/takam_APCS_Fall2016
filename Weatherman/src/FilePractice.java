//Takahiro Mollenkamp 2/22/17
// this program is a practice of using files by doing temperature weather 

import java.io.*;     
import java.util.*;  

public class FilePractice {


	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("./Test/weather.txt"));//directing where to find file
		double day1 = input.nextDouble();
		while(input.hasNext()==true){//as long as there is a number the code will run
			double day2=input.nextDouble();
			double diff=day2-day1;//find the change in temperature
			System.out.println(day1+ " to "+day2+", change = "+diff);
			day1=day2;//move to the next day
		}
		
	}





}
