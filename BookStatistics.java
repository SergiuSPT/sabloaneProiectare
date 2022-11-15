
public class BookStatistics implements Visitor {

	@Override
	public void visitBook(Book book) {
		
		
	}

	@Override
	public void visitSection(Section section) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTable(Table table) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitParagraph(Paragraph paragraph) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitImageProxy(ImageProxy image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	public void printStatistics() {
		System.out.println("Book statistics:\n Number of images: "+
				+"\n Number of tables:"+ +"\n Number of paragraphs:"+);
	}
}
