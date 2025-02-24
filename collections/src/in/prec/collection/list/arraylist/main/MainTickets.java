package in.prec.collection.list.arraylist.main;

import in.prec.collection.list.arraylist.entities.Tickets;
import in.prec.collection.list.arraylist.utility.TicketUtility;

public class MainTickets {
	public static void main(String[] args) {
		TicketUtility utility = new TicketUtility();
		
		utility.addTicket(new Tickets("A1", 180.20F));
		utility.addTicket(new Tickets("A8", 0));
		utility.addTicket(new Tickets("A3", 190.20F));
		utility.addTicket(new Tickets("A5", 0));
		utility.addTicket(new Tickets("A4", 210.20F));
		utility.addTicket(new Tickets("A2", 0));
		utility.addTicket(new Tickets("A6", 250.20F));
		utility.addTicket(new Tickets("A7", 280.20F));
		
		Tickets ticket1=utility.getTicketByIndex(2);
		System.out.println(ticket1);
		
//		System.out.println(new Tickets("A6", 250.20F).equals(null));
		
		Tickets ticket2=utility.getTicketByTicketNo(new Tickets("A6", 250.20F));
		System.out.println(ticket2);
		
		Tickets ticket01 = new Tickets("A1",123);
		Tickets ticket02 = new Tickets("A1",123);
		
		System.out.println(ticket01.equals(ticket02));
		
		System.out.println(ticket01.hashCode());
		System.out.println(ticket02.hashCode());
		
		System.out.println(utility.totalIncome());
		
		utility.printTickets();
		
		
	}
}
