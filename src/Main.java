//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import utils.age.AgeImplementation;
import utils.name.NameImplementation;

import static utils.age.AgeConstant.BIG_Y;
import static utils.age.AgeConstant.SMALL_Y;

public class Main {
    public static void main(String[] args) {
        AgeImplementation ageImplementation = new AgeImplementation();
        NameImplementation nameImplementation = new NameImplementation();
        String proceed = SMALL_Y;
        while (proceed.equals(SMALL_Y) || proceed.equals(BIG_Y)) {
            nameImplementation.getFirstName();
            nameImplementation.getLastName();
            int age = ageImplementation.getAge();
            nameImplementation.printName();
            ageImplementation.validateAge(age);
            proceed = ageImplementation.getUserInput();
        }
    }
}

