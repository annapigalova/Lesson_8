import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Set<T> {

	private ArrayList<T> set = new ArrayList<>();

	public List<T> getSet() {
		return set;
	}

	public void addElement(T element) {

		if (set.contains(element)) {
			System.out.println("Element " + element + " already exists");
		} else {
			set.add(element);
			System.out.println("Element " + element + " was added successfully");
		}

	}

	public void sortElement(Comparator<T> comparator) {
		set.sort(comparator);

	}

}