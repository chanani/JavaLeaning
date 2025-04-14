package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex2_Student {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        List<String> studentList = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                studentList.add(student.getName());
            }
        }
        return studentList;
    }

    private static List<String> lambda(List<Student> students) {
        List<Student> filterList = GenericFilter.filter(students, student -> student.getScore() >= 80);
        List<String> mapList = GenericMapper.map(filterList, student -> student.getName());
        return mapList;
    }


}
