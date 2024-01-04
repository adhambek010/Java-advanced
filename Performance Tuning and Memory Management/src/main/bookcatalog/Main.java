package main.bookcatalog;
public class Main {

	public static void main(String[] args) {

		System.out.println("---START OF PROBLEM 1---");
		System.out.println("The current exchange rates are USD 1 = ");
		Price price = new Price(1.0);
		price.getRates().forEach( (k,v) -> System.out.println(k + " " + v));

		//price.getRates().put("USD", 2d);
		System.out.println("The current exchange rates are USD 1 = ");
		price.getRates().forEach( (k,v) -> System.out.println(k + " " + v));
		
		System.out.println("---END OF PROBLEM 1---");
		
		System.out.println("---START OF PROBLEM 2---");
		BookCollection bc = new BookCollection();
		bc.printAllBooks();

		ReadOnlyBook emma = bc.findBookByName("Emma");
		//emma.setPrice(999d);
		bc.printAllBooks();
		
		System.out.println("---END OF PROBLEM 2---");
		
		System.out.println("---START OF PROBLEM 3---");

		ReadOnlyBook book = bc.findBookByName("Tom Jones");
		System.out.println("Tom Jones costs USD " + book.getPrice());
		System.out.println("Tom Jones costs EUR " + book.getPrice().convert("EUR"));
		System.out.println("Tom Jones costs GBP " + book.getPrice().convert("GBP"));
		System.out.println("---END OF PROBLEM 3---");
		
		
	}
}
