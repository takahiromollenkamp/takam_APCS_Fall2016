
public abstract class Ticket {
	private int number=0;
	public double getPrice(){
		return 0.0;
	}
	public Ticket(int x){
		number = x;
	}
	public String toString(){
		String s = "number: "+number+", price: " + getPrice();
		return s;
	}
}
