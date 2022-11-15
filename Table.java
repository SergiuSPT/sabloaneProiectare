



public class Table implements Element {
	String name;
	
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
	@Override
	public void accept(Visitor visitor) {
		visitor.visitTable(this);
		
	}
	
}


