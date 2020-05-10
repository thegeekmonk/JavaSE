package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapSorting {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(10, "Baba");
//		map.put(20, "Name");
//		map.put(50, "Java");

		List<String> a = new ArrayList<>();
		a.add("a1");
		a.add("a2");
		a.add("a3");

		// a.add("a4");
		// a.add(0, "a5");
		List<String> b = a.subList(0, 1);
		b.add("x");
		b.add("N");
		b.add("p");
		System.out.println(a + "" + b);

		List<String> s = Arrays.asList("a");
		s.add("x");
		System.out.println(s);

		System.out.println();
	}

}
