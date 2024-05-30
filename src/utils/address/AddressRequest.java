package utils.address;

public interface AddressRequest {
    String getCountry();
    String getStreetAddress();
    String getZipCode();
    String getCity();
    String getState();
    void printAddress();

}
