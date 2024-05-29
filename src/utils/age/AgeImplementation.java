package utils.age;

import java.util.Scanner;

public class AgeImplementation implements AgeUtils {
    int age;
    String proceed;

    @Override
    public int getAge() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter age:\t");

        age = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Age is: " + age);  // Output user input
        return age;
    }

    @Override
    public String getUserInput() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to proceed. y or n \n");

        proceed = myObj.nextLine();  // Read user input

        return proceed;
    }

    @Override
    public void validateAge(int age) {
        if (age < 13 && age > 0) {
            System.out.print("Category: Kid\n");
        } else if (age < 18 && age > 13) {
            System.out.print("Category: Teen\n");
        } else if (age > 18) {
            System.out.print("Category: Adult\n");
        } else {
            System.out.println("Invalid age");

        }
    }
}
