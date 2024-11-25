package ca.nl.cna.java1.inheritance.employees;

import java.time.LocalDate;
import java.util.Random;

/**
 * Generate Employee objects
 */
public class EmployeeFactory {

    /**
     * Generate random Employee objects for debugging purposes. Employee can be any type
     * @return Employee
     */
    public static Employee generateRandomEmployee(){
        Random random = new Random();

        LocalDate randomDOB = LocalDate.of(1965 + random.nextInt(40),
                random.nextInt(12) + 1,
                random.nextInt(28) + 1);

        if(random.nextInt() % 2 == 0){
            return new SalaryEmployee("Salary",
        "McGee" + String.valueOf(random.nextInt(30)+1),
                "EI" + String.valueOf(random.nextInt(3000)+1),
                randomDOB,
                random.nextDouble()* random.nextInt(500000));

        } else {
            return new CommissionEmployee("Commishy",
                    "McGee" + String.valueOf(random.nextInt(30)+1),
                    "EI" + String.valueOf(random.nextInt(3000)+1),
                    randomDOB,
                    0.10,
                    random.nextDouble()* random.nextInt(5000000));

        }

    }



}
