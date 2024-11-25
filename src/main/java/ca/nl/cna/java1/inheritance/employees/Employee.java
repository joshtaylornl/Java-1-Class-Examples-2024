package ca.nl.cna.java1.inheritance.employees;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;

/**
 * Base class for an Employee hierarchy based around payment. This class is
 * abstract and the children should define how the Employee is paid
 *
 * @author josh.taylor
 */
public abstract class Employee {

    private String firstName;
    private String lastName;
    protected String id;
    private LocalDate birthDate;

    /**
     * Constructor that sets up an employee object with all information
     * @param firstName first name
     * @param lastName last name
     * @param id employee id
     * @param birthDate date of birth
     */
    public Employee(String firstName, String lastName, String id, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.birthDate = birthDate;
    }

    /**
     * Get first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set first name
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get id
     * @return employee id
     */
    public String getId() {
        return id;
    }

    /**
     * Set id
     * @param id employee id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get date of birth
     * @return date of birth
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Set date of birth
     * @param birthDate date of birth
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Calculate the employee age
     * @return age in years
     */
    public int getAge(){
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    /**
     * Print the employee details in a String to a print stream for debugging purposes
     * @param printStream print stream
     */
    public void printEmployees(PrintStream printStream){
        printStream.printf("\nEmployee details: %s, %s, Age: %d, Annual Pay: $%.2f",
                getFirstName(), getLastName(), getAge(), calculateAnnualPay());
    }

    /**
     * Calculates the annual pay for the Employee
     * @return annual pay
     */
    public abstract double calculateAnnualPay();

}
