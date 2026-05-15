package interview;

//Java program to illustrate 
//overriding of equals and 
//hashcode methods 
import java.io.*; 
import java.util.*; 

class Car 
{ 
	
	String name; 
	int id; 
	
	Car(String name, int id) 
	{ 
		
		this.name = name; 
		this.id = id; 
	} 
	
	@Override
	public boolean equals(Object obj) 
	{

		// if both the object references are
		// referring to the same object.
		if (this == obj)
			return true;

		// it checks if the argument is of the
		// type Car by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof Car)) return false; ---> avoid.
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		// type casting of the argument.
		Car geek = (Car) obj;

		// comparing the state of argument with
		// the state of 'this' Object.
		return (geek.name.equals(this.name) && geek.id == this.id);
	} 
	
	@Override
	public int hashCode() 
	{ 
		
		// We are returning the car_id 
		// as a hashcode value. 
		// we can also return some 
		// other calculated value or may 
		// be memory address of the 
		// Object on which it is invoked. 
		// it depends on how you implement 
		// hashCode() method. 
		return this.id; 
		
	//	return 1;
	//	there’s nothing illegitimate with having hashCode() returning any fixed value.

	//	However, this implementation degrades the functionality of hash tables to basically zero, as every object would be stored in the same, single bucket.
	
		
		// return (int) id * name.hashCode() * email.hashCode();
		
		//This basic hashing algorithm is definitively much better than the previous one. 
	} 
	
} 

//Driver code 
public class HashCodeExample { 
	public static void main (String[] args) 
	{ 
		
		// creating two Objects with 
		// same state 
		Car g1 = new Car("aditya", 1); 
		Car g2 = new Car("aditya", 1); 
		
		Map<Car, String> map = new HashMap<Car, String>(); 
		map.put(g1, "CSE"); 
		map.put(g2, "IT"); 
		
		for(Car geek : map.keySet()) 
		{ 
			System.out.println(map.get(geek).toString()); 
		} 

	} 
} 
