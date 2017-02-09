
public class TicketTester {

	public static void main(String[] args) {
		WalkupTicket f=new WalkupTicket(5);
		System.out.println(f);
		AdvanceTicket g=new AdvanceTicket(7,9);
		System.out.println(g);
		StudentAdvanceTicket nerd= new StudentAdvanceTicket(8,15);
		System.out.println(nerd);

	}

}
