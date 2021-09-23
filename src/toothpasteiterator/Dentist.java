package toothpasteiterator;

public class Dentist {
	ToothPaste whiteningStore = new WhiteningStore();
	ToothPaste herbalStore = new HerbalStore();
	
	public Dentist( ToothPaste whiteningStore, ToothPaste herbalStore ) {
		this.whiteningStore = whiteningStore;
		this.herbalStore = herbalStore;
	}
	public void printToothPaste() {
		Iterator whiteningIterator = whiteningStore.getIterator();
		Iterator herbalIterator = herbalStore.getIterator();
		System.out.println("\n -----------Whitening ToothPaste -------------\n");
		printToothPaste(whiteningIterator);
		System.out.println("\n------------Herbal ToothPaste ----------------\n");
		printToothPaste(herbalIterator);
	}
	public void printToothPaste(Iterator iterator) {
		while(iterator.hasNext()) {
			ToothPasteItem toothPasteItem = iterator.next();
			System.out.print(toothPasteItem.getName() + ", ");
			System.out.print(toothPasteItem.getDescription() + ", ");
			System.out.println(toothPasteItem.getPrice() );
		}
	}
}
