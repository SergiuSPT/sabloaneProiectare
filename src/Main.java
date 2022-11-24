
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firma f= new Firma("Nokia");
		Departament d = new Departament("5G");
		d.add(new Manager("Sehn",10000));
		d.add(new Programator("Cellum",15000));
		d.add(new Programator("Incepator",5000));
		f.add(d);
		VisitorSalar calculSalar= new VisitorSalar();
		f.accept(calculSalar);
		calculSalar.print();
		
}
