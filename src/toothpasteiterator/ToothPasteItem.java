package toothpasteiterator;

public class ToothPasteItem {
	String name;
	String description;
	double price;
	public ToothPasteItem(String name , String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return (name + " , \n" + description + ", " + price +"\n");
	}
	
}
