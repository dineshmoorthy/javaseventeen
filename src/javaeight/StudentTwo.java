package javaeight;

public class StudentTwo implements Comparable<StudentTwo> {

	// same student class with comparable here
	
    @Override
    public int compareTo(StudentTwo other) {
        int deptCompare = this.department.compareTo(other.department);
        if (deptCompare != 0) return deptCompare;

        int marksCompare = this.marks.compareTo(other.marks);
        if (marksCompare != 0) return marksCompare;

        return this.studentName.compareTo(other.studentName);
    }
    
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
	public StudentTwo(int studentId, String studentName, String department, double stipend, String location, String marks,
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
		return "StudentTwo [studentId=" + studentId + ", studentName=" + studentName + ", department=" + department
				+ ", stipend=" + stipend + ", location=" + location + ", marks=" + marks + ", grade=" + grade
				+ ", expertise=" + expertise + "]";
	}
	
}
