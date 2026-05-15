package practice.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
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

	@Override
	public int hashCode() {
		return Objects.hash(area, cover, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(area, other.area) && Objects.equals(cover, other.cover) && id == other.id
				&& Objects.equals(name, other.name);
	}
	

	
}

class ProductArea implements Comparator<Product>{

	
	public ProductArea() {
		super();
	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		int a = o1.getArea().compareTo(o2.getArea());
		
		if (a != 0)
			return a;
		else
			return Integer.compare(o1.getId(), o2.getId());
	}
	
}

public class Four{
	
	public static final Comparator<Product> PRODUCT_AREA = Comparator.comparing(Product::getArea); 
	public static final Comparator<Product> PRODUCT_ID = Comparator.comparing(Product::getId);
	
	
	
	
	public static void main(String[] args) {
	
		List<Product> productlist = new ArrayList<>(Arrays.asList(new Product("plastic", 3, "india", "anyshape"),
				new Product("bottle", 4, "europe", "cone"), new Product("burger", 5, "unitedkingdom", "box"),
				new Product("tablet", 8, "america", "rectangle"), new Product("dustbin", 13, "india", "oval"),
				new Product("rice", 31, "america", "bag"), new Product("ice", 81, "america", "stick"),
				new Product("book", 32, "morocco", "square"), new Product("phone", 43, "iceland", "cube"),
				new Product("glass", 23, "america", "plate")
		));
		
		List<Product> result = productlist.stream().sorted(Comparator.comparing(Product::getArea).thenComparing(Product::getId)).collect(Collectors.toList());
		
		result.forEach(System.out::println);

		//productlist.stream().sorted(Comparator.comparing((Product p) -> p.area).thenComparing((a,b) -> Integer.compare(a.getId(), b.getId()))).forEach(System.out::println);;
		
		//productlist.stream().sorted(PRODUCT_AREA.thenComparing(PRODUCT_ID)).forEach(System.out::println);
		
		
		Collections.sort(productlist, new ProductArea());
		
		//productlist.forEach(System.out::println);
		
		Product one = new Product("bottle", 4, "europe", "cone"); 
		Product two = null;
		// two = new Product("burger", 5, "unitedkingdom", "box");
		 two = new Product("bottle", 4, "europe", "cone");
		System.out.println(one.equals(two));
	}
}