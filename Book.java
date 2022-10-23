import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class Book extends Section {
	Author author;
	
	List<Element> elementList = new ArrayList<>();
	public Book(String title) {
		super(title);
=======
public class Book {
	String title;
	Author author;
	
	List<Chapter> chapterList = new ArrayList<>();
	public Book(String title) {
		this.title=title;
>>>>>>> c8623005e7ec7c04aae819c03c34f99b39b44647
		
	};
	
	public void addAuthor(Author name) {
		author=name;
	}
	
<<<<<<< HEAD
	public void print(){
		System.out.println(title);
		System.out.println("Lista cu elementele: "+elementList);
		
	}

	public void addContent(Element element) {
		
		elementList.add(element);
=======
	public int createChapter(String chapterName) {
		Chapter capitol = new Chapter(chapterName);
		chapterList.add(capitol);
		return chapterList.size()-1;
		}
	
	public Chapter getChapter(int chapterIndex) {
		
		return chapterList.get(chapterIndex);
	}
	
	public void print(){
		System.out.println(title);
>>>>>>> c8623005e7ec7c04aae819c03c34f99b39b44647
		
	}
	
	 
}
