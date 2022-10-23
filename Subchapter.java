import java.util.ArrayList;
import java.util.List;

public class Subchapter {
	
<<<<<<< HEAD
	List<Element> elementsList = new ArrayList<>();
=======
	List<Elements> elementsList = new ArrayList<>();
>>>>>>> c8623005e7ec7c04aae819c03c34f99b39b44647
	String name;
	public Subchapter(String name) {
		this.name= name;
		System.out.println("A subchapter was created with name: "+ name);
	};

	public void createNewParagraph(String text) {
		Paragraph paragraf = new Paragraph(text);
		elementsList.add(paragraf);
	}
	public void createNewImage(String text) {
		Image imagine = new Image(text);
		elementsList.add(imagine);
	}
	public void createNewTable(String text) {
		Table tabel = new Table(text);
		elementsList.add(tabel);
	}
	public void print(){
		System.out.println(elementsList);
	}
}
