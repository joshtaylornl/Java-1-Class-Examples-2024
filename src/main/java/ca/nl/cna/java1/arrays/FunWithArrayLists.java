package ca.nl.cna.java1.arrays;

import ca.nl.cna.java1.objects.Student;

import java.util.ArrayList;

/**
 * An introduction to ArrayLists
 *
 * @author Josh
 */
public class FunWithArrayLists {

    /**
     * This is a main application
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Fun with Array Lists");

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(FunWithStudents.generateRandomStudent());
        studentList.add(FunWithStudents.generateRandomStudent());
        studentList.add(FunWithStudents.generateRandomStudent());
        studentList.add(FunWithStudents.generateRandomStudent());

        for (Student student: studentList) {
            FunWithStudents.printStudentInfo(student);
        }

        System.out.println("\nQED");

    }

}
