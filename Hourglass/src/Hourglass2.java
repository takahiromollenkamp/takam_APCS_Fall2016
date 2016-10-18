import java.util.*;
public class Hourglass2 {

	public static void main(String[] args) {
		System.out.println("How many layers");
		Scanner console=new Scanner(System.in);
		
		int line=console.nextInt();
		printBase(line); //Print the firstline
		topHalf(line); //Print the top half
		midLine(line);
		System.out.println("||");
		bottomHalf(line);
		printBase(line);
		}

		public static void topHalf(int x){
			int a=x;
			
			for (int i=1; i <=x; i++){//print each line
				//print spaces
				for (int j=1; j<=i; j++){
					System.out.print(" ");
				}
				System.out.print("\\");
				for (int j=0; j<a; j++) { 
					System.out.print("::");
				}
				System.out.println("/");
				a--;
			}
		}

	public static void printBase(int x){
		System.out.print("|");
		for (int i = 1; i<=(2*x+2);i++){
			System.out.print("\"");
		}
		System.out.println("|");

	}
	public static void midLine(int x){
		for (int i=0; i<=x; i++){
			System.out.print(" ");
		}
	}
	public static void bottomHalf(int x){
		int a=0;
		for (int i=x; i >0; i--){//print each line
			//print spaces
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j=0; j<=a; j++) { 
				System.out.print("::");
			}
			System.out.println("\\");
			a++;
		}
	}

}
