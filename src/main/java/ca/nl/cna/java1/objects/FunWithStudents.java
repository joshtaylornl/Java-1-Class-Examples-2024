package ca.nl.cna.java1.objects;

import java.util.Scanner;

public class FunWithStudents {

    public static void main(String[] args) {
        System.out.println("Fun with Students");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter students first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter students last name: ");
        String lastName = input.nextLine();

        //instantiating a class firstStudent
        Student firstStudent = new Student(firstName, lastName);
        
        System.out.printf("First Students name: %s %s\n",
                firstStudent.getFirstName(),
                firstStudent.getLastName());

        //Adding a second student to show another object of the same type
        Student secondStudent = new Student("Jane", "Doe");

        System.out.printf("Second Students name: %s %s\n",
                secondStudent.getFirstName(),
                secondStudent.getLastName());


    }

}
