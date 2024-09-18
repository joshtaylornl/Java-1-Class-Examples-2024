package ca.nl.cna.java1.objects;

import java.util.Scanner;

public class FunWithStudents {

    public static void main(String[] args) {
        System.out.println("Fun with Students");

        Scanner input = new Scanner(System.in);

        //instantiating a class firstStudent
        Student firstStudent = new Student();

        System.out.println("Enter students first name: ");
        String firstName = input.nextLine();
        firstStudent.setFirstName(firstName);

        System.out.println("Enter students last name: ");
        String lastName = input.nextLine();
        firstStudent.setLastName(lastName);

        System.out.printf("First Students name: %s %s\n",
                firstStudent.getFirstName(),
                firstStudent.getLastName());

        //Adding a second student to show another object of the same type
        Student secondStudent = new Student();
        secondStudent.setFirstName("Jane");
        secondStudent.setLastName("Doe");

        System.out.printf("Second Students name: %s %s\n",
                secondStudent.getFirstName(),
                secondStudent.getLastName());


    }

}
