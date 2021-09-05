package practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	
	Product(int id, String name,float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}	
}

public class StreamLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"IPhone XR",52000f));
		list.add(new Product(2,"Samsung Galaxy",52000f));
		list.add(new Product(3,"Moto G2",15000f));
		list.add(new Product(4,"One Plus8",32000f));
				
		float totalPrice = (float)list.stream().mapToDouble(p->p.price).sum();
		System.out.println(totalPrice);
		
		double priceList = list.stream().map(p->p.price).collect(Collectors.summingDouble(i->i));
		System.out.println("Total Price : "+priceList);
		
		//using filter	
		List<Float> price = list.stream().filter(p -> p.price > 30000f).map(i->i.price).collect(Collectors.toList());
		System.out.println(price);
		
		List<Float> li = list.stream().filter(j->j.price >= 32000f).map(Product :: getPrice).collect(Collectors.toList());
		System.out.println(li);
		
		Map<Integer,String> map = list.stream().collect(Collectors.toMap(p->p.id,p->p.name));
		System.out.println(map);
		
		Set<Float> set = list.stream().filter(k -> k.price >30000f).map(Product::getPrice).collect(Collectors.toSet());
		System.out.println(set);
	}

}
