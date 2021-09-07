package practice.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(4);
		list.add(123);
		list.add(156);
		list.add(5);
		
		String str = list.stream().map(i-> i%2 == 0 ? "e"+i : "o"+i).collect(Collectors.joining(","));
		System.out.println(str);
		
		double d = list.stream().collect(Collectors.averagingInt(i->i));
        System.out.println(d);
        
        list.stream().map(i->String.valueOf(i)).filter(j->j.startsWith("1")).forEach(System.out::println);
        
        Set<Integer> set = new HashSet<>();
        System.out.println("Set Addition Returned Value : "+set.add(5));
        
        //list of unique elements
        list.stream().filter(i->!set.add(i)).distinct().forEach(System.out::println);
        
        System.out.println(" ");
        list.stream().distinct().forEach(System.out::println);
        
        System.out.println("First Element : "+list.stream().findFirst());
        
        System.out.println("1st Element --> "+list.stream().findFirst().get());
        
	}

}
