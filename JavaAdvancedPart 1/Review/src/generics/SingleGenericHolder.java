package generics;

public class SingleGenericHolder<T> {
	T object;
	
	public SingleGenericHolder(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return this.object;
	}
	
	public static void main(String[] args) {
		SingleGenericHolder<Integer> holder = new SingleGenericHolder<Integer>(10);
		System.out.println(holder.getObject());
		
		SingleGenericHolder<String> holder2 = new SingleGenericHolder<String>("Azizbek");
		System.out.println(holder2.getObject() );
	}
}
