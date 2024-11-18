package ca.nl.cna.java1.arrays;

import ca.nl.cna.java1.objects.Student;

public class FunWithStudentArray {

    public static void main(String[] args) {
        System.out.println("Fun with Students in an Array!");

        final int NUM_STUDENTS = 10;
        Student[] studentArray = new Student[NUM_STUDENTS];

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = FunWithStudents.generateRandomStudent();
        }

        for (Student student : studentArray) {
            FunWithStudents.printStudentInfo(student);
        }
    }

}
