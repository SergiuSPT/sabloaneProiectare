import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
	Author author;
	
	List<Element> elementList = new ArrayList<>();
	public Book(String title) {
		super(title);
		
	};
	
	public void addAuthor(Author name) {
		author=name;
	}
	
	public void print(){
		System.out.println(title);
		System.out.println("Lista cu elementele: "+elementList);
		
	}

	public void addContent(Element element) {
		
		elementList.add(element);
		
	}
	
	 
}
