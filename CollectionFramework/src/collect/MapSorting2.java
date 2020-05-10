package collect;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSorting2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(10, "Akhil");
		map.put(30, "Baba");
		map.put(50, "Trump");
		map.put(90, "Java");

		Set set = map.entrySet();

		// Map.Entry<Integer,String> map = (Map.Entry<Integer, String>)map.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry en = (Map.Entry) itr.next();
			System.out.println(en.getKey() + "  -->  " + en.getValue());
		}

		System.out.println("Printing in Sorted order :-");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("Printing in Sorted Reverse order :-");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		System.out.println("\nPrinting in Value based Sorted order :-");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("\nPrinting in Value based Reverse Sorted order :-");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

	}

}
