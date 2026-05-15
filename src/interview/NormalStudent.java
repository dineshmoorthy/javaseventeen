package interview;

import java.util.Objects;

public class NormalStudent implements Comparable<NormalStudent> {
    private int id;
    private String name;

    // Constructor
    public NormalStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }

    // here we are implementign comparto code inside the method
    // Implement compareTo
    
    @Override
    public int compareTo(NormalStudent other) {
        return Integer.compare(this.id, other.id);    	
    }
    
    /*
    // in this example we are not overridding hashcode and equals method
    // here we are not implementign comparto code inside the method
    @Override
	public int compareTo(NormalStudent o) {
		// TODO Auto-generated method stub
		return 0;
	}
    */
    
    
    
    
    // For printing
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    /*
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NormalStudent other = (NormalStudent) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
*/
	
}

