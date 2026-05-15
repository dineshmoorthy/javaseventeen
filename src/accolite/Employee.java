package accolite;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	 private int employeeId;
	    private String employeeName;
	    private String department;
	    private double salary;

	    public Employee(int employeeId, String employeeName, String department, double salary) {
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.department = department;
	        this.salary = salary;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public String getEmployeeName() {
	        return employeeName;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee ID: " + employeeId +
	               ", Name: " + employeeName +
	               ", Department: " + department +
	               ", Salary: " + salary;
	    }

		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.employeeId, o.employeeId);
		}
	
	
	
	
	
}
