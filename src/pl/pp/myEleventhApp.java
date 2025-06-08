package pl.pp;

import java.util.*;

public class myEleventhApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student bestStudent = students.get(0);
        double total = 0;

        for (Student s : students) {
            double avg = s.getAverageGrade();
            total += avg;
            if (avg > bestStudent.getAverageGrade()) {
                bestStudent = s;
            }
        }

        double generalAverage = total / students.size();

        System.out.println("Student with the highest average: " + bestStudent.getFirstName()
                + " " + bestStudent.getLastName() + " (" + bestStudent.getIndex()
                + ") - Average: " + bestStudent.getAverageGrade());

        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("\nStudents sorted by last names:");
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName()
                    + " (" + s.getIndex() + ") - Average: " + s.getAverageGrade());
        }
    }
}