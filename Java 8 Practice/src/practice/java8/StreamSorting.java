package practice.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(34);
		list.add(13);
		list.add(5);
		list.add(56);
		
		//sorting ascending order
		list.stream().sorted().forEach(System.out::println);
		
		//sorting descending order
		list.stream().sorted((i,j)->i < j ?1:-1).forEach(System.out::println);
		
	}

}
