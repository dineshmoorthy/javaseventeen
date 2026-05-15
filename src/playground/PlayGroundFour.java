package playground;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
	public String name;
	public int id;
	public String area;
	public String cover;
		
	public Product(String name, int id, String area, String cover) {
		super();
		this.name = name;
		this.id = id;
		this.area = area;
		this.cover = cover;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", area=" + area + ", cover=" + cover + "]";
	}
	
	
}

class ProductArea implements Comparator<Product>{
	
	public ProductArea() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		int area = o1.getArea().compareTo(o2.getArea());
		if(area != 0) {
			return area;
		}else
		return Integer.compare(o1.getId(), o2.getId());
	}

	
}

public class PlayGroundFour extends Thread{
	public static volatile int value = 0;
	public static void main(String[] args) {
	Thread t1 = new Thread(() -> {
		while(value> 5) {
			System.out.println("Incremented: "+value);
		}
	});
		
	Thread t2 = new Thread(() -> {
		
		try {
			Thread.sleep(500);
			System.out.println("changed: "+value);
			while(value< 5)
				value++;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	});
	t2.start();
	t1.start();
	}
}