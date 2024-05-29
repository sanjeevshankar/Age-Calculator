//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        String proceed = "y";
        while (proceed.equals("y")) {
            age = getAge();
            validateAge(age);
            proceed = getUserInput();
        }
    }

    private static void validateAge(int age) {
        if (age < 13) {
            System.out.print("Kid\n");
        } else if (age < 18 && age > 13) {
            System.out.print("Teen\n");
        } else if (age > 18) {
            System.out.print("Adult\n");
        }
    }

    private static int getAge() {
        int age;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter age:\t");

        age = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Age is: " + age);  // Output user input
        return age;
    }

    private static String getUserInput() {
        String proceed;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to proceed. y or n \n");

        proceed = myObj.nextLine();  // Read user input

        return proceed;
    }
}

