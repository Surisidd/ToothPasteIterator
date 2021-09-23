package toothpasteiterator;
import java.util.*;
public class WhiteningStoreIterator implements Iterator{
	List<ToothPasteItem> toothPasteItems;
	int position = 0;
	
	public WhiteningStoreIterator(List<ToothPasteItem> toothPasteItems) {
		this.toothPasteItems = toothPasteItems;
	}
	public boolean hasNext() {
		if(position >= toothPasteItems.size()) {
			return false;
		}
		else {
			return true;
		}
	}
	public ToothPasteItem next() {
		ToothPasteItem toothPasteItem = toothPasteItems.get(position);
		position = position + 1;
		return toothPasteItem;
	}
	
}
