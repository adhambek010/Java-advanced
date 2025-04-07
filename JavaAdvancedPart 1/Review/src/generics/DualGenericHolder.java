package generics;

public class DualGenericHolder<T, U> {
	T object1;
	U object2;
	public DualGenericHolder(T object1, U object2) {
		this.object1 = object1;
		this.object2 = object2;
	}
	
	public void display() {
		System.out.println(object1);
		System.out.println(object2);
	}
	
	public static void main(String[] args) {
		DualGenericHolder<String, Integer> object = new DualGenericHolder
				<String, Integer>("SimplyCode", 10);
		
		object.display();
		
	}
	
}
