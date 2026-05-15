package interview;

class AddressDeep implements Cloneable {
    
	String city;
    
	public AddressDeep(String city) {
        this.city = city;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "AddressDeep [city=" + city + "]";
	}
    
    
}

class PersonDeep implements Cloneable {
    String name;
    AddressDeep addressdeep;

    public PersonDeep(String name, AddressDeep addressdeep) {
        this.name = name;
        this.addressdeep = addressdeep;
    }

    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressDeep getAddressdeep() {
		return addressdeep;
	}

	public void setAddressdeep(AddressDeep addressdeep) {
		this.addressdeep = addressdeep;
	}

	@Override
	public String toString() {
		return "PersonDeep [name=" + name + ", addressdeep=" + addressdeep + "]";
	}
    
    public Object clone() throws CloneNotSupportedException {
    	PersonDeep cloned = (PersonDeep) super.clone();
    	// comment below line to see the differnt output
         // cloned.addressdeep = (AddressDeep) addressdeep.clone(); // Deep copy
        return cloned;
    }

    
    
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
    	AddressDeep addressdeep = new AddressDeep("London");
    	PersonDeep p1 = new PersonDeep("John", addressdeep);
    	PersonDeep p2 = (PersonDeep) p1.clone();

       // p2.addressdeep.city = "New York"; // Changes city in both p1 and p2
        System.out.println("P1: "+p1.addressdeep.city); // Output: London
        System.out.println("P2: "+p2.addressdeep.city); 
        
        // you can either set value directly to variable or through setter method
        // if you used constructor it will not work because clone should happen. if constructor new object is created
        p2.addressdeep.setCity("Kumbakonam");
        System.out.println("P3: "+p1.toString()); // Output: Kumbakonam
        System.out.println("P4: "+p2.toString()); 
    }
}
