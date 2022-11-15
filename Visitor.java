
public interface Visitor {
	public void visitBook(Book book);
	public void visitSection(Section section);
	public void visitTable(Table table);
	public void visitParagraph(Paragraph paragraph);
	public void visitImageProxy(ImageProxy image);
	public void visitImage(Image image);
}
