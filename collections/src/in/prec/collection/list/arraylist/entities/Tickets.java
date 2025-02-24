package in.prec.collection.list.arraylist.entities;

import java.util.Objects;

public class Tickets implements Comparable<Tickets>{
	private String ticketNo;
	private float price;

	public Tickets() {}

	public Tickets(String ticketNo, float price) {
		this.ticketNo = ticketNo;
		this.price = price;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		if(obj==null)
			return false;
		
		if(this.getClass()!=obj.getClass())
			return false;
		
		Tickets temp = (Tickets) obj;
		
		return this.price==temp.price && this.ticketNo.equals(temp.ticketNo);
		
	}
	
	@Override
	public int hashCode() {
//		int hash =13;
//		hash = hash + 17 * ticketNo.hashCode();
//		hash = hash + 17 * (int) price;
//		return hash;
		return Objects.hash(ticketNo,price);
	}
	
	@Override
	public int compareTo(Tickets t) {
//		return t.ticketNo.compareTo(this.ticketNo);
//		return (int)(t.price-this.price);
		return Float.compare(this.price, t.price);
	}

	@Override
	public String toString() {
		return "Tickets [ticketNo=" + ticketNo + ", price=" + price + "]";
	}

}
