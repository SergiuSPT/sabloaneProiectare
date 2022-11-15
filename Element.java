
public interface Element {
	
	public void accept(Visitor visitor);
	public void print();
	public void addElement(Element element);
	public void removeElement(Element element);
	public Element getElement(int index);
}
