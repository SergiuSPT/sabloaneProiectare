import java.util.ArrayList;
import java.util.List;

public class Book {
	String title;
	Author author;
	
	List<Chapter> chapterList = new ArrayList<>();
	public Book(String title) {
		this.title=title;
		
	};
	
	public void addAuthor(Author name) {
		author=name;
	}
	
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
		
	}
	
	 
}
