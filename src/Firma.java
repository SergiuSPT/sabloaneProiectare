import java.util.ArrayList;
import java.util.List;
public class Firma {
	String nume;
	List<Departament> listaDepartamente = new ArrayList<>();
	public Firma(String nume) {
		this.nume=nume;
	}
	
	public void add(Departament d) {
		listaDepartamente.add(d);
	}
	
	public void accept(Visitor v) {
		v.visitFirma(this);
		for(int i=0; i<listaDepartamente.size();i++)
		{
			v.visitDepartamente(listaDepartamente.get(i));
		}
	}
}
