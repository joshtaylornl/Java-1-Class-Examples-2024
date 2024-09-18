package ca.nl.cna.java1.objects;

public class FunWithStudents {

    public static void main(String[] args) {
        System.out.println("Fun with Students");

        Student student = new Student();
        student.setFirstName("John");

        System.out.printf("Students first name: %s\n", student.getFirstName());

    }

}
