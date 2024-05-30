package utils.name;

import java.util.Scanner;

public class NameImplementation implements NameRequest{

    private String firstName;
    private String lastName;
    private String name;
    /**
     * @return first name
     */
    @Override
    public String getFirstName() {
        System.out.println("Welcome, please input your information below.");
        System.out.println(" ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first name:\t");
        firstName = myObj.nextLine();  // Read user input
        System.out.println("Your first name is: " + firstName + ".");
        System.out.println(" ");// Output user input
        return firstName;

    }

    /**
     * @return last Name
     */
    @Override
    public String getLastName() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter last name:\t");
        lastName = myObj.nextLine();  // Read user input
        System.out.println("Your last name is " + lastName + ".");  // Output user input
        System.out.println(" ");
        return lastName;
    }

    /**
     * prints the first and last name
     */
    @Override
    public void printName() {
        setName();
        System.out.println(" ");
        System.out.println("Results:");
        System.out.println("Your full name is " + name + ".");

    }

    private void setName() {
        name = firstName.toUpperCase() + " " + lastName.toUpperCase();
    }
}
