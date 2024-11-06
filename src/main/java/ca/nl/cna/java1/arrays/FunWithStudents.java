package ca.nl.cna.java1.arrays;

import ca.nl.cna.java1.objects.Student;

import java.util.Random;

public class FunWithStudents {

    public static void main(String[] args) {
        System.out.println("Fun with students!");

        Student student = generateRandomStudent();
        printStudentInfo(student);

    }


    /**
     * Print out student information
     * @param student
     */
    public static void printStudentInfo(Student student){
        System.out.printf("\nStudent: %s %s",
                student.getFirstName(), student.getLastName());

    }

    public static Student generateRandomStudent(){
        Random random = new Random();
        return new Student("Student" + random.nextInt(100), "McStudenty");
    }

}
