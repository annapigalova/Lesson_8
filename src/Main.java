import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Set<String> set1 = new Set<>();
		set1.addElement("G");
		set1.addElement("A");
		set1.addElement("B");
		set1.addElement("B");
		set1.addElement("C");
		set1.addElement("A");

		Set<Integer> set2 = new Set<>();
		set2.addElement(1);
		set2.addElement(1);
		set2.addElement(3);
		set2.addElement(5);

		Comparator cmp = Collections.reverseOrder();

		set1.sortElement(cmp);
		set2.sortElement(cmp);

		for (int i = 0; i < set1.getSet().size(); i++)
			System.out.println(set1.getSet().get(i));

		System.out.println("");

		for (int i = 0; i < set2.getSet().size(); i++)
			System.out.println(set2.getSet().get(i));

	}

}
