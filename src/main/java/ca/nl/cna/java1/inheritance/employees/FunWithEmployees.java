package ca.nl.cna.java1.inheritance.employees;

import java.time.LocalDate;

public class FunWithEmployees {

    public static void main(String[] args) {
        System.out.println("Fun with Employees");

        for (int i = 0; i < 10; i++) {
            EmployeeFactory.generateRandomEmployee().printEmployees(System.out);
        }
    }

}
