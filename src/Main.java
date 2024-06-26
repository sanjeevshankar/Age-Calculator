//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import utils.age.AgeImplementation;
import utils.name.NameImplementation;
import utils.address.AddressImplementation;

import static utils.age.AgeConstant.BIG_Y;
import static utils.age.AgeConstant.SMALL_Y;

public class Main {
    public static void main(String[] args) {
        AgeImplementation ageImplementation = new AgeImplementation();
        NameImplementation nameImplementation = new NameImplementation();
        AddressImplementation addressImplementation = new AddressImplementation();
        String proceed = SMALL_Y;
        while (proceed.equals(SMALL_Y) || proceed.equals(BIG_Y)) {
            nameImplementation.getFirstName();
            nameImplementation.getLastName();
            int age = ageImplementation.getAge();
            addressImplementation.getStreetAddress();
            addressImplementation.getCity();
            addressImplementation.getZipCode();
            addressImplementation.getState();
            addressImplementation.getCountry();
            nameImplementation.printName();
            ageImplementation.validateAge(age);
            addressImplementation.printAddress();
            proceed = ageImplementation.getUserInput();
        }
    }
}

