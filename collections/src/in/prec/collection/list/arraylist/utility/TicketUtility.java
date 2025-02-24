package in.prec.collection.list.arraylist.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import in.prec.collection.list.arraylist.entities.Tickets;

public class TicketUtility {
	List<Tickets> ticketList;
//	Composition one to many relationship
	public TicketUtility() {
		ticketList = new ArrayList<>();
	}
	
	public void addTicket(Tickets ticket) {
		ticketList.add(ticket);
	}
	
	public Tickets getTicketByIndex(int index) {
		return ticketList.get(index);
	}
	
	public Tickets getTicketByTicketNo(Tickets ticket) {
		int index = -1;
		if(ticketList.contains(ticket))
			index = ticketList.indexOf(ticket);
		
		return getTicketByIndex(index);
	}
	
	public Tickets getTicketByPrice(Tickets ticket) {
		int index = 0;
		if(ticketList.contains(ticket))
			index=ticketList.indexOf(ticket);
		
		return ticketList.get(index);
	}
	
	public float totalIncome() {
		float sum=0;
		try(Stream<Tickets> ticketStream=ticketList.stream()){
			Optional<Float> sum1=ticketStream.filter(e->e.getPrice()!=0).map(e->e.getPrice()).reduce((e1,e2)->e1+e2);
			
			if(sum1.isPresent())
				sum=sum1.get();
		}
		
		
		return sum;
	}
	
	public void printTickets() {
		try(Stream<Tickets> ticketStream = ticketList.stream()){
			ticketStream.sorted().forEach(System.out::println);
		}
	}
	
}
