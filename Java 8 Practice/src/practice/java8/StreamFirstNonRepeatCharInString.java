package practice.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFirstNonRepeatCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaplee";
		
		Character result = str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
				                      .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				                      .entrySet()
				                      .stream()
				                      .filter(i->i.getValue() == 1L)
				                      .map(j->j.getKey())
				                      .findFirst()
				                      .get();
		System.out.println("1st Non Repeatative Char : "+result);
		
		Character non = str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i->i.getValue() > 1L)
				.map(j->j.getKey())
				.findFirst()
				.get();
		System.out.println("1st Repeatative Char : "+non);
		
	}

}
