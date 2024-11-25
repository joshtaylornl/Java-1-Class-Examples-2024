package ca.nl.cna.java1.inheritance.employees;

import java.time.LocalDate;

/**
 * Commission Employee class represents employees that earn only commission
 * on sales.
 *
 * @author josh.taylor
 */
public class CommissionEmployee extends Employee {

    private double rate;
    private double annualSales;

    /**
     * Constructor that takes in all Employee parameters as well as the rate and annual sales for commmission.
     * @param firstName first name
     * @param lastName last name
     * @param id employee id
     * @param birthDate date of birth
     * @param rate commission rate (of the format 0.10 = 10%)
     * @param annualSales annual sales
     */
    public CommissionEmployee(String firstName, String lastName, String id, LocalDate birthDate, double rate, double annualSales) {
        super(firstName, lastName, id, birthDate);
        this.rate = rate;
        this.annualSales = annualSales;
    }

    /**
     * Get the commission rate (of the format 0.10 = 10%)
     * @return commission rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Set the commission rate (of the format 0.10 = 10%)
     * @param rate commission rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Get annual sales that commission is applied to
     * @return annual sales
     */
    public double getAnnualSales() {
        return annualSales;
    }

    /**
     * Set annual sales
     * @param annualSales annual sales
     */
    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }

    /**
     * Calculate annual pay based on commission rate times annual sales
     * @return
     */
    @Override
    public double calculateAnnualPay() {
        return this.annualSales * this.rate;
    }
}
