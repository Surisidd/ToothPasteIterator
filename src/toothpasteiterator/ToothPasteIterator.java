package toothpasteiterator;

public class ToothPasteIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToothPaste whiteningPaste = new WhiteningStore();
		ToothPaste herbalPaste = new HerbalStore();
		
		Dentist dentist = new Dentist(whiteningPaste, herbalPaste);
		
		dentist.printToothPaste();
	}

}
