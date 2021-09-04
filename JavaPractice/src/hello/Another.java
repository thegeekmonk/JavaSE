package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		List<Integer> list = new ArrayList<>();
				
		list.add(5);
		list.add(7);
		
		
//		int add = list.stream().filter(i -> i%2 != 0).map(j->j*j).collect(Collectors.averagingInt(p->p));
		
		int add = list.stream().filter(i->i%2 != 0).mapToInt(p->p*p).sum();
		
		System.out.println(add);
		
	}

}
