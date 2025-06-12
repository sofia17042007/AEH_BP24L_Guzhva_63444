package pl.pp;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // Находим студента с наивысшим средним баллом
        Student bestStudent = Collections.max(students, Comparator.comparingDouble(Student::getAverageGrade));
        System.out.println("Student with the highest average: " + bestStudent);

        // Считаем средний балл всех студентов
        double totalAverage = students.stream()
                .mapToDouble(Student::getAverageGrade)
                .average()
                .orElse(0.0);
        System.out.printf("Average grade of all students: %.2f%n", totalAverage);

        // Сортируем студентов по фамилии
        students.sort(Comparator.comparing(Student::getLastName));
        System.out.println("Students sorted by last names:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
