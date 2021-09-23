package toothpasteiterator;
import java.util.*;
public class WhiteningStore implements ToothPaste {
	List<ToothPasteItem> toothPasteItems;
	public WhiteningStore() {
		toothPasteItems = new ArrayList<ToothPasteItem>();
		addItem("Crest 3D White Brilliance", "The toothpaste also prevents future stains with its 3X Stain Fighting Power", 23);
		addItem("Arm & Hammer advance white extreme", "This toothpaste whitens with peroxide and baking soda meant for maximum effectiveness, lifting stains and bringing a brighter smile.", 23);
		addItem("Tom's of Maine Antiplaque", "Packed with natural ingredients, this multitasker promises to whiten teeth, prevent plaque and tartar build-up, and freshen breath, all without artificial dyes, sweeteners, flavors, or preservatives", 23);
		addItem("Go Natural Herbal Whitening Tooth Powder", "It contains powerful coconut oil, and turmeric and promises to help naturally lift stains from your teeth.", 23);
		addItem("Sensodyne", "It contains potassium nitrate meant to quickly help relieve sensitivity, and it keeps working to prevent pain for 24 hours, according to the brand.", 23);
	}
	private void addItem(String name , String description, double price ) {
		ToothPasteItem toothPasteItem = new ToothPasteItem(name, description , price );
		toothPasteItems.add(toothPasteItem);
		
	}
	public Iterator getIterator() {
		return new WhiteningStoreIterator(toothPasteItems);
	}
	public List<ToothPasteItem> getItems(){
		return toothPasteItems;
	}
	public String toString() {
		return "Whitening Store";
	}
}
