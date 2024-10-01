package ca.nl.cna.java1.objects;

public class FunWithCourses {

    public static void main(String[] args) {
        System.out.println("Fun with Courses!");

        Course course = new Course("CP2280","Object-Oriented Programming in Java",
                "This course is a OOP course in Java.",4);

        System.out.printf("Course info: \n%s\t%s\t\n%s \nCredits: %d",
                course.getNumber(), course.getName(), course.getDescription(), course.getCredits());



    }

}
