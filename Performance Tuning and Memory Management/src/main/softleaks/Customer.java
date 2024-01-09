package main.softleaks;
public class Customer {

	public Customer(String name) {
		this.name = name;
	}
	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return id + " : " + name;
	}


	
}

