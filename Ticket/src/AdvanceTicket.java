public class AdvanceTicket extends Ticket{
    private int day;
	public AdvanceTicket(int x, int y) {
		super(x);
		day=y;
	}
	public int getDay(){
		return day;
	}
	
	public double getPrice(){
		if(day<10){
			return 30.0;
		}
		return 40.0;
	}
	
}
