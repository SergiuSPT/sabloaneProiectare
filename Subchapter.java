import java.util.ArrayList;
import java.util.List;

public class Subchapter {
	
	List<Element> elementsList = new ArrayList<>();
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
