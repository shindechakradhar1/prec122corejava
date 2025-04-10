package in.prec.ioniopackages.basicoperations.entities;

import java.io.Serializable;

public class Movies implements Serializable{
	private String name;
	private String actor;

	public Movies() {}

	public Movies(String name, String actor) {
		this.name = name;
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movies [Name=" + name + ", actor=" + actor + "]";
	}

}
