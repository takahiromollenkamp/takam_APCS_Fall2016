
public class Hourglass {

	public static void main(String[] args) {
		printBase(); //Print the firstline
		topHalf(); //Print the top half
		System.out.println("     ||");
		bottomHalf();
		printBase();
		}

		public static void topHalf(){
			int x=4;
			
			for (int i=1; i <=4; i++){//print each line
				//print spaces
				for (int j=1; j<=i; j++){
					System.out.print(" ");
				}
				System.out.print("\\");
				for (int j=0; j<x; j++) { 
					System.out.print("::");
				}
				System.out.println("/");
				x--;
			}
		}

	public static void printBase(){
		System.out.print("|");
		for (int i = 1; i<=10;i++){
			System.out.print("\"");
		}
		System.out.println("|");

	}
	public static void bottomHalf(){
		int x=0;
		for (int i=4; i >0; i--){//print each line
			//print spaces
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j=0; j<=x; j++) { 
				System.out.print("::");
			}
			System.out.println("\\");
			x++;
		}
	}

}
