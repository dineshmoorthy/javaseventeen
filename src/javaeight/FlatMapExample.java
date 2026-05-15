package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> courses = Arrays.asList(
            Arrays.asList("Math", "Physics"),
            Arrays.asList("Chemistry", "Biology"),
            Arrays.asList("History")
        );

        // Using flatMap to get a single list of course names
        List<String> allCourses = courses.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());

        System.out.println("Flattened List: " + allCourses);
    }
}
