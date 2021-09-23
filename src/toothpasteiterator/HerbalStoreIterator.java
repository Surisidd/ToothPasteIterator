package toothpasteiterator;

public class HerbalStoreIterator implements Iterator{
	ToothPasteItem[] toothPasteItems;
	int position = 0;
	
	public HerbalStoreIterator( ToothPasteItem[] toothPasteItems ) {
		this.toothPasteItems = toothPasteItems;
	}
	public boolean hasNext() {
		if(position >= toothPasteItems.length || toothPasteItems[position] == null ) {
			return false;
		}
		else {
			return true;
		}
	}
	public ToothPasteItem next() {
		ToothPasteItem toothPasteItem = toothPasteItems[position];
		position = position + 1;
		return toothPasteItem;
	}
}
