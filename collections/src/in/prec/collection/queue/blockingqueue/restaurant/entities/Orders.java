package in.prec.collection.queue.blockingqueue.restaurant.entities;

public class Orders {
	private int id;
	private String order;

	public Orders() {}

	public Orders(int id, String order) {
		this.id = id;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", order=" + order + "]";
	}

}
