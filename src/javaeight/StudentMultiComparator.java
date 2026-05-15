package javaeight;

import java.util.Comparator;
import accolite.Student;

public class StudentMultiComparator implements Comparator<Student> {
	// 	below way is multicomparators in one class 

	// way 2 you can create each comparasion in a separate comparator class
	// then you can do comparator.apply --> thenapply --> thenapply
	
    @Override
    public int compare(Student s1, Student s2) {
        int deptCompare = s1.getDepartment().compareTo(s2.getDepartment());
        if (deptCompare != 0) {
            return deptCompare;
        }

        int marksCompare = s1.getMarks().compareTo(s2.getMarks());
        if (marksCompare != 0) {
            return marksCompare;
        }

        return s1.getStudentName().compareTo(s2.getStudentName());
    }
}
