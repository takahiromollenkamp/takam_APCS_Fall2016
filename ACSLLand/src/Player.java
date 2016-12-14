//Takahiro Mollenkamp 12/14/2016
//This program simulates the ACSLLand game


import java.util.Scanner;

class Player {
	private int location=0;//the players start at first cell, which is 0.
	public int getLocation(){
		return location;//getter method
	}
	public void movePlayer(int num){//moves the players
		if(num==4||num==6){
			this.location-=num;
		}
		else this.location+=num;
		if(this.location<0){
			this.location=0;
		}
	}
	public void penalty(){//punishes the player when the other lands on top of him
		this.location=0;
	}
	public static void main(String args[]){
		Player a=new Player();//create new players
		Player b=new Player();
		String cumulativeAnswer="";
		System.out.println("Yo enter a line");
		Scanner input=new Scanner (System.in);
		String line=input.nextLine();
		int count=1;
		while(count<6){//simulates the game 5 times
			String[] bsMoveNums=line.split(",");//it's bs b/c I want int array
			int [] moveNums=new int[bsMoveNums.length];
			for(int i=0; i<moveNums.length; i++){
				moveNums[i]=Integer.parseInt(bsMoveNums[i]);
			}


			int move=moveNums[0];
			for(int i=0; move!=0; i++){//the action happens in this loop, until 0 is the input 
				if(i%2==0){//in even occasion, it's a's turn
					a.movePlayer(move);
					if (a.getLocation()==b.getLocation()){
						b.penalty();
					}

				}
				if(i%2==1){//in odd occasion, it's b's turn
					b.movePlayer(move);
					if (a.getLocation()==b.getLocation()){
						a.penalty();
					}
				}
				move=moveNums[i+1];
				if(a.getLocation()>=39||b.getLocation()>=39){
					move=0;//force quit if one reaches the end
				}
			}
			String aFinal;//figure the final locations
			String bFinal;	
			if(a.getLocation()>=39){
				aFinal="END";
			} else { aFinal=""+a.getLocation();}
			if(b.getLocation()>=39){
				bFinal="END";
			} else{bFinal=""+b.getLocation();}
			String answer="A-"+aFinal+", B-"+bFinal;//answer output
			System.out.println(answer);
			
			cumulativeAnswer+=count+":"+ answer+"   ";
			a.penalty();
			b.penalty();
			if(count<5){
				line=input.nextLine();//don't need input at 5th try
			}
			count++;
		}
		System.out.println("This is the summary.  "+cumulativeAnswer);
	}
}