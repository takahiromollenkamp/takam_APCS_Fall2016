
public class StudentAdvanceTicket extends AdvanceTicket{

	public StudentAdvanceTicket(int x, int y) {
		super(x, y);
	}
	public double getPrice(){
		double jj=super.getPrice();
		jj=jj/2.0;
		return jj;
	}
	public String toString(){
		String s=super.toString();
		s+=" (ID required)";
		return s;
	}
}
