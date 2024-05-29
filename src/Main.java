//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import utils.HelperImplementation;

import static utils.AgeConstant.BIG_Y;
import static utils.AgeConstant.SMALL_Y;


public class Main {
    public static void main(String[] args) {
        HelperImplementation helperImplementation = new HelperImplementation();
        int age;
        String proceed = SMALL_Y;
        while (proceed.equals(SMALL_Y) || proceed.equals(BIG_Y)) {
            age = helperImplementation.getAge();
            helperImplementation.validateAge(age);
            proceed = helperImplementation.getUserInput();
        }
    }
}

