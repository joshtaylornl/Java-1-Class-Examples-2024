package ca.nl.cna.java1.inheritance.employees;

import java.time.LocalDate;

/**
 * Salary Employee which is just an employee with a fixed annual salary
 *
 * @author josh.taylor
 */
public class SalaryEmployee extends Employee {

    private double annualSalary;

    /**
     * Constructor that completes Employee information and adds Salary
     * @param firstName first name
     * @param lastName last name
     * @param id employee id
     * @param birthDate date of birty
     * @param annualSalary annual salary
     */
    public SalaryEmployee(String firstName, String lastName, String id, LocalDate birthDate, double annualSalary) {
        super(firstName, lastName, id, birthDate);
        if(annualSalary >= 0){
            this.annualSalary = annualSalary;
        }
    }

    /**
     * Get Annual Salary
     * @return annual salary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Set Annual Salary
     * @param annualSalary annual salary
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * Calculate the annual pay by returning the annual salary
     * @return annual salary
     */
    @Override
    public double calculateAnnualPay() {
        return this.annualSalary;
    }
}
