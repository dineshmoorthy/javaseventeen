package javaeight;

public class Item {
    private int id;
    private String name;
    private String location;

    public Item(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.location = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return location; }

    @Override
    public String toString() {
        return "Staff [id=" + id + ", name=" + name + ", department=" + location + "]";
    }

    // equals and hashCode --> not overridden
    
}
