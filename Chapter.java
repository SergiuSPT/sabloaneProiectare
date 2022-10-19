import java.util.ArrayList;
import java.util.List;

public class Chapter {
	String name;
	List<Subchapter> subchapterList = new ArrayList<>();
		public Chapter(String name) {
			this.name= name;
			System.out.println("A chapter was created with name: "+ name);
		};
		
		public int createSubchapter(String subchapterName) {
			Subchapter subcapitol = new Subchapter(subchapterName);
			subchapterList.add(subcapitol);
			return subchapterList.size()-1;
			}
		
		public Subchapter getSubchapter(int subchapterIndex) {
			
			return subchapterList.get(subchapterIndex);
		}
}
