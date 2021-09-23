package toothpasteiterator;

public class HerbalStore implements ToothPaste{
	ToothPasteItem[] toothPasteItems;
	static final int MAX_ITEMS = 12;
	int position = 0;
	public HerbalStore() {
		toothPasteItems = new ToothPasteItem[MAX_ITEMS] ;
		addItem("Senodyne" , "Sensodyne promises 24/7 protection for sensitive teeth if used twice a day and potassium nitrate helps them deliver that promise" , 20);
		addItem("Colgate Sensitive" , "Contains ingredients that block the tubules in dentin, keeping sensitivity triggers from accessing the nerves in your teeth. " , 20);
		addItem("Squigle Tooth Builder" , "Tooth Builder is 36% natural xylitol, an ingredient from birch trees which prevents plaque. " , 20);
		addItem("Hello" , "contains the highest level of the active ingredient potassium nitrate allowed by the FDA." , 20);

	}
	private void addItem(String name, String description, double price ) {
		ToothPasteItem toothPasteItem = new ToothPasteItem(name, description , price );
		toothPasteItems[position] = toothPasteItem;
		position = position + 1;
		
	}
	public Iterator getIterator() {
		return new HerbalStoreIterator(toothPasteItems);
	}
	public String toString() {
		return "Herbal Tooth Paste";
	}
	public ToothPasteItem[] getItems() {
		return toothPasteItems;
	}
}
