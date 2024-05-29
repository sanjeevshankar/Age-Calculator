//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import utils.age.AgeImplementation;

import static utils.age.AgeConstant.BIG_Y;
import static utils.age.AgeConstant.SMALL_Y;


public class Main {
    public static void main(String[] args) {
        AgeImplementation ageImplementation = new AgeImplementation();
        String proceed = SMALL_Y;
        while (proceed.equals(SMALL_Y) || proceed.equals(BIG_Y)) {
            ageImplementation.validateAge(ageImplementation.getAge());
            proceed = ageImplementation.getUserInput();
        }
    }
}

