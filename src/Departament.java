import java.util.ArrayList;
import java.util.List;

public class Departament {
	List<Angajat> listaAngajati = new ArrayList<>();
	String nume;
	 public Departament(String nume) {
		 this.nume= nume;
	 }
	 
	 public void add(Angajat a) {
		 listaAngajati.add(a);
	 }
	 
	 
}
