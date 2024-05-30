package utils.address;

import java.util.Scanner;

public class AddressImplementation implements AddressRequest{

    private String country;
    private String streetAddress;
    private String zipCode;
    private String city;
    private String state;
    private String address1;
    private String address2;


    /**
     * @return Country
     */
    @Override
    public String getCountry() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your country:");
        country = myObj.nextLine();
        System.out.println("You are from " + country + ".");
        System.out.println(" ");
        return country;
    }

    /**
     * @return Street Address
     */
    @Override
    public String getStreetAddress() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your street address:");
        streetAddress = myObj.nextLine();
        System.out.println("Your street address is " + streetAddress + ".");
        System.out.println(" ");
        return streetAddress;
    }

    /**
     * @return ZIP Code
     */
    @Override
    public String getZipCode() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your zipcode:");
        zipCode = myObj.nextLine();
        System.out.println("Your ZIP code is " + zipCode + ".");
        System.out.println(" ");
        return zipCode;
    }

    /**
     * @return City
     */
    @Override
    public String getCity() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your city:");
        city = myObj.nextLine();
        System.out.println("You live in the city " + city + ".");
        System.out.println(" ");
        return city;
    }

    /**
     * @return State
     */
    @Override
    public String getState() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your state:");
        state = myObj.nextLine();
        System.out.println("You live in the state " + state + ".");
        System.out.println(" ");
        return state;
    }

    /**
     *
     */
    @Override
    public void printAddress() {
        setAddress();
        System.out.println(" ");
        System.out.println("Address:");
        System.out.println(address1);
        System.out.println(address2);



    }

    private void setAddress() {
        address1 = streetAddress;
        address2 = city + ", " + state + " " + zipCode + " (" + country + ")";
    }


}
