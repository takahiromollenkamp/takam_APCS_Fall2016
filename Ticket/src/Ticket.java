
public abstract class Ticket {
	public Ticket(int x){
		number=x;
	}
	private int number;
	public int getDays(){
		return number;
	}
	public abstract int getPrice();
	public String toString(){
		String s="Number: "+number+" Price: "+ getPrice();
		return s;
	}
}


