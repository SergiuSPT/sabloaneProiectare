import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	String title;
	List<Element> elementsList = new ArrayList<>();
	public Section(String element) {
		System.out.println(element);
		this.title = element;
	}
	
	public void add(Element el) {
		
		elementsList.add(el);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addElement(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElement(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElement(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
