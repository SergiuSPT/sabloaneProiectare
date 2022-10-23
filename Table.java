<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Table implements Element {
	String name;
	List<Element> elementsList = new ArrayList<>();
	public Table(String name) {
		this.name= name;
		System.out.println("Table: "+ name);
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
	
=======

public class Table implements Elements {
	String name;
	public Table(String name) {
		this.name= name;
		System.out.println("Table: "+ name);
	};
>>>>>>> c8623005e7ec7c04aae819c03c34f99b39b44647
}
