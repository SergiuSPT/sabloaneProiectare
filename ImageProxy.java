
public class ImageProxy implements Element {
	String url;
	
	public Image loadImage(Image realImage) {
		if(realImage==null)
			realImage = new Image(url);
		return realImage;
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
		visitor.visitImageProxy(this);
		
	}

}
