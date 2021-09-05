package practice.java8;

import java.util.ArrayList;
import java.util.List;

import com.java.lambda.Product;

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
		list.add(new Product(2,"Samsung Galaxy",47000f));
		list.add(new Product(3,"Moto G2",15000f));
		list.add(new Product(4,"One Plus8",32000f));
		
		
		float totalPrice = (float)list.stream().mapToDouble(p->p.price).sum();
		System.out.println(totalPrice);
	}

}
