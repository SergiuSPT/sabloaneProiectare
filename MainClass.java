
public class MainClass {

	public static void main(String[] args) {
	/*	Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph 1");
        discoTitanic.createNewParagraph("Paragraph 2");
        discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewImage("Image 2");
        discoTitanic.createNewImage("Image 3");
        discoTitanic.createNewTable("Table1");
        discoTitanic.print();
        */
        

		/*Book discoTitanic = new Book("Disco Titanic");
=======
		Book discoTitanic = new Book("Disco Titanic");
>>>>>>> c8623005e7ec7c04aae819c03c34f99b39b44647
		Author rpGheo = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubchapter("Subcapitolul 1.1");
		Subchapter scOneOne = chp1.getSubchapter(indexSubChapterOneOne);
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		scOneOne.print();
<<<<<<< HEAD
		*/
		
		
		/*Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
		noapteBuna.addContent(cap1);
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));
		noapteBuna.print();
		*/
		
		/*long startTime = System.currentTimeMillis();
		Image img1 = new Image("Pamela Anderson");
		Image img2 = new Image("Kim Kardashian");
		Image img3 = new Image("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Book playboy = new Book("Playboy");

		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");
        */
		
		/*Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());

		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();*/
		
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
	}

}
