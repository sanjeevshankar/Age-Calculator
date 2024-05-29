package utils;

import java.util.Scanner;

public class HelperImplementation implements Helper {
    @Override
    public int getAge() {
        int age;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter age:\t");

        age = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Age is: " + age);  // Output user input
        return age;
    }

    @Override
    public String getUserInput() {
        String proceed;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to proceed. y or n \n");

        proceed = myObj.nextLine();  // Read user input

        return proceed;
    }

    @Override
    public  void validateAge(int age) {
        if (age < 13) {
            System.out.print("Kid\n");
        } else if (age < 18 && age > 13) {
            System.out.print("Teen\n");
        } else if (age > 18) {
            System.out.print("Adult\n");
        }
    }
}
