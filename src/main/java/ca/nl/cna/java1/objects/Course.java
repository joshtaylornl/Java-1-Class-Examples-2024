package ca.nl.cna.java1.objects;

/**
 * A simple object to represent a course at CNA. It has a number (ie. CP220), title, description and credits.
 * This class is not to be confused with a CourseOffering which is a Course that is being executed by a college or
 * school at a location with an instructor and a group of registered students.
 * @author josh.taylor
 */
public class Course {

    private String number;
    private String name;
    private String description;
    private int credits;

    /**
     * Creates the Course with all necessary information
     * @param number number
     * @param name name
     * @param description description
     * @param credits credits - must be greater than or equal to 0
     */
    public Course(String number, String name, String description, int credits) {
        this.number = number;
        this.name = name;
        this.description = description;
        if(credits >= 0){
            this.credits = credits;
        }
    }

    /**
     * Get the number
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Set the number
     * @param number number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Get the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the credits
     * @return credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Set the credits
     * @param credits credits - must be greater than or equal to 0
     */
    public void setCredits(int credits) {
        if(credits >= 0){
            this.credits = credits;
        }
    }
}
