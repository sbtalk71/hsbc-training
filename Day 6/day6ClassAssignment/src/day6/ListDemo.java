package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Shimla");
		cities.add("Lucknow");
		cities.add("Gorakhpur");
		cities.add("Kanpur");
		cities.add("Allahabad");

		cities.add(2, "Odisha");
		cities.remove(1);
		System.out.println(cities);
		Collections.sort(cities, new MyListSorter());

	}

}

class MyListSorter implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);

	}
}
