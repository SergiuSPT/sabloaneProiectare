
import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
	String name;
	List<Element> elementsList = new ArrayList<>();
	public Paragraph(String name) {
		this.name= name;
		System.out.println("Paragraph: "+ name);
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
	@Override
	public void accept(Visitor visitor) {
		visitor.visitParagraph(this);
		
	}
	

}
