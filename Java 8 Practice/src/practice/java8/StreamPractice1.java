package practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(4);
		
		String str = list.stream().map(i-> i%2 == 0 ? "e"+i : "o"+i).collect(Collectors.joining(","));
		System.out.println(str);

	}

}
