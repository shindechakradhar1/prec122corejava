package in.prec.java8features.testingfunctionalinterfaces.entities;

public class Fan {
	private String color;
	private int speed;

	public Fan() {}

	public Fan(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Fan [color=" + color + ", speed=" + speed + "]";
	}

}
