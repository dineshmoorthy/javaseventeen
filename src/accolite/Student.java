package accolite;

import java.util.Objects;

public class Student {

	private int studentId;
	private String studentName;
	private String department;
	private double stipend;
	private String location;
	private String marks;
	private int grade;
	private String expertise;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getStipend() {
		return stipend;
	}
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public Student(int studentId, String studentName, String department, double stipend, String location, String marks,
			int grade, String expertise) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.stipend = stipend;
		this.location = location;
		this.marks = marks;
		this.grade = grade;
		this.expertise = expertise;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", department=" + department
				+ ", stipend=" + stipend + ", location=" + location + ", marks=" + marks + ", grade=" + grade
				+ ", expertise=" + expertise + "]";
	}
	
	

}
