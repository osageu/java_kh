package mvc3.model.vo;
import java.util.Comparator;

public class SortDesc implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getAuthor().compareTo(o1.getAuthor());
	}
	
}
