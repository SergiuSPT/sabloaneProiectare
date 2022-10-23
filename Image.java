
import java.util.ArrayList;
import java.util.List;

public class Image implements Element{
	String name;
	List<Element> elementsList = new ArrayList<>();
	public Image(String name) {
		this.name= name;
		System.out.println("Image with title: "+ name);
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
