


import java.util.concurrent.TimeUnit;

public class Image implements Element{
	String name;
	String url;
	
	public Image(String name) {
		this.name= name;
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
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
	@Override
	public void accept(Visitor visitor) {
		visitor.visitImage(this);
		
	}
	

}
