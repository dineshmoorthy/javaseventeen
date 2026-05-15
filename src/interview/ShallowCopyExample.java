package interview;
class AddressShallow {
    String city;
    public AddressShallow(String city) {
        this.city = city;
    }
}

class PersonShallow implements Cloneable {
    String name;
    AddressShallow addresshallow;

    public PersonShallow(String name, AddressShallow addresshallow) {
        this.name = name;
        this.addresshallow = addresshallow;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressShallow addresshallow = new AddressShallow("London");
        PersonShallow p1 = new PersonShallow("John", addresshallow);
        PersonShallow p2 = (PersonShallow) p1.clone();

        p2.addresshallow.city = "New York"; // Changes city in both p1 and p2
        System.out.println(p1.addresshallow.city); // Output: New York
    }
}
