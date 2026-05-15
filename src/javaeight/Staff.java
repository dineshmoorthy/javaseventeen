package javaeight;

public class Staff // implements Comparable<Staff> 
{
    private int id;
    private String name;
    private String department;
    private int salary;

    public Staff(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    

    public Staff(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Staff [id=" + id + ", name=" + name + ", department=" + department + "]";
    }
/*
	@Override
	public int compareTo(Staff o) {
		// TODO Auto-generated method stub
		if(this.getId() == o.getId())
		return 0;
		else if ( this.getId() < o.getId())
		return -1;
		else
		return 1;
	}
*/
    // equals and hashCode shown in #7
}
