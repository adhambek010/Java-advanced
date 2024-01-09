package main.garbagecollection;

public class Customer  {
	private String name;

	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(Customer oldCustomer) {
		this.name = oldCustomer.name; 
	}
	
	
	public String toString() {
		return name;
	}

	@Override
    public void finalize(){
		System.out.println("This object is being g.c " + name);
	}

}
