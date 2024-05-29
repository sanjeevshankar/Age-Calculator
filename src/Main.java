//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import utils.HelperImplementation;


public class Main {
    public static void main(String[] args) {
        HelperImplementation helperImplementation = new HelperImplementation();
        int age;
        String proceed = "y";
        while (proceed.equals("y")) {
            age = helperImplementation.getAge();
            helperImplementation.validateAge(age);
            proceed = helperImplementation.getUserInput();
        }
    }


}

